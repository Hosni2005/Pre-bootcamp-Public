import { useState } from "react";
import "./App.css";
import ColorForm from "./components/ColorForm";
import Box from "./components/Box";

function App() {
  const [boxes, setBoxes] = useState([]);

  return (
    <>
      <ColorForm boxes={boxes} setBoxes={setBoxes} />
      <Box boxes={boxes} />
    </>
  );
}

export default App;