import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import CarMap from './components/CarsMap'
import CarForLoop from './components/CarsForLoop'
import UsersTable from './components/UsersTable'
import ConditionalRendering from './components/ConditionalRendering'

function App() {
   return (
    <>
    <UsersTable />
    <ConditionalRendering />
    </>
  );
}

  
  

export default App
