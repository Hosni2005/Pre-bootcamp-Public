import { useState } from "react";
import { useNavigate } from "react-router-dom";


const Search = () => {

  const [resource, setResource] = useState("people");
  const [id, setId] = useState("");

  const navigate = useNavigate();


  const handleSearch = (e) => {
    e.preventDefault();

    if(id === "") return;

    navigate(`/${resource}/${id}`);
  };


  return (
    <form onSubmit={handleSearch}>

      <select 
        value={resource}
        onChange={(e)=>setResource(e.target.value)}
      >

        <option value="people">
          Characters
        </option>

        <option value="planets">
          Planets
        </option>

      </select>


      <input
        type="number"
        placeholder="Enter ID"
        value={id}
        onChange={(e)=>setId(e.target.value)}
      />


      <button>
        Search
      </button>

    </form>
  );
};


export default Search;