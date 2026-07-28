import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "./assets/vite.svg";
import heroImg from "./assets/hero.png";
import "./App.css";
import PersonCard from "./component/PersonCard.jsx";

function App() {
  return (
    <div className="App">
      <PersonCard
        firstName="Jane"
        lastName="Doe"
        age={45}
        hairColor="Black"
      />

      <PersonCard
        firstName="John"
        lastName="Smith"
        age={88}
        hairColor="Brown"
      />
    </div>
  );
}

export default App;
