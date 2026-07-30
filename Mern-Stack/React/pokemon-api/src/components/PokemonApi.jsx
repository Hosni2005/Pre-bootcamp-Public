import { useState } from "react";

const PokemonApi = () => {
  const [pokemon, setPokemon] = useState([]);
  const [error, setError] = useState("");

  const fetchPokemon = async () => {
    try {
      const response = await fetch(
        "https://pokeapi.co/api/v2/pokemon?limit=1000"
      );

      const res = await response.json();
      setPokemon(res.results);
      setError("");
    } catch (error) {
      console.log(error);
      setError("There was an error on the server.");
    }
  };

  return (
    <div>
      <button onClick={fetchPokemon}>Fetch Pokemon</button>

      {error && <p>{error}</p>}

      <ul>
        {pokemon.map((poke) => (
          <li key={poke.name}>{poke.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default PokemonApi;