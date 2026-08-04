import { Routes, Route } from "react-router-dom";
import Search from "./components/Search";
import Home from "./pages/Home";
import Details from "./pages/Details";

function App() {
  return (
    <>
      <Search />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/:resource/:id" element={<Details />} />
      </Routes>
    </>
  );
}

export default App;
