import { useState } from "react";
import "./Tabs.css";

const Tabs = ({ tabs }) => {
  const [activeTab, setActiveTab] = useState(0);

  const handleClick = (index) => {
    setActiveTab(index);

    // Optional callback
    if (tabs[index].callback) {
      tabs[index].callback();
    }
  };

  return (
    <div className="tabs-container">
      <div className="tab-headers">
        {tabs.map((tab, index) => (
          <button
            key={index}
            className={activeTab === index ? "tab active" : "tab"}
            onClick={() => handleClick(index)}
          >
            {tab.label}
          </button>
        ))}
      </div>

      <div className="tab-content fade">
        <p>{tabs[activeTab].content}</p>
      </div>
    </div>
  );
};

export default Tabs;
