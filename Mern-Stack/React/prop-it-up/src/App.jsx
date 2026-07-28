import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import PersonCard from './components/PersonCard'

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
        age={32}
        hairColor="Brown"
      />

      <PersonCard
        firstName="Emily"
        lastName="Johnson"
        age={28}
        hairColor="Blonde"
      />

      <PersonCard
        firstName="Michael"
        lastName="Williams"
        age={38}
        hairColor="Red"
      />
    </div>
  );
}

export default App
