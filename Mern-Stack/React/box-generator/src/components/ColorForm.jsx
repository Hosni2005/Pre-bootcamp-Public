import { useState } from "react";

const ColorForm = ({ boxes, setBoxes }) => {
  const [color, setColor] = useState("");
  const [size, setSize] = useState("");

  const Submit = (e) => {
    e.preventDefault();

    if (color.trim() === "") return;

    const newBox = {
      color: color,
      size: size ? Number(size) : 100,
    };

    setBoxes([...boxes, newBox]);

    setColor("");
    setSize("");
  };

  return (
    <form onSubmit={Submit}>
      <div>
        <label htmlFor="color">Color: </label>
        <input
          type="text"
          id="color"
          value={color}
          onChange={(e) => setColor(e.target.value)}
        />
      </div>

      <div>
        <label htmlFor="size">Size: </label>
        <input
          type="number"
          id="size"
          value={size}
          onChange={(e) => setSize(e.target.value)}
        />
      </div>

      <button type="submit">Add</button>
    </form>
  );
};

export default ColorForm;
