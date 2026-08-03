import { useState } from "react";
import Tabs from "./components/Tabs";

function App() {
  const tabs = [
    {
      label: "Tab 1",
      content: "This is the content of Tab 1.",
      callback: () => alert("Tab 1 clicked"),
    },
    {
      label: "Tab 2",
      content: "Welcome to Tab 2!",
      callback: () => console.log("Tab 2 clicked"),
    },
    {
      label: "Tab 3",
      content: "This is Tab 3 content.",
    },
    {
      label: "Tab 4",
      content: "Another tab with different content.",
    },
  ];

  return (
    <div>
      <h1>React Tabs</h1>
      <Tabs tabs={tabs} />
    </div>
  );
}

export default App;
