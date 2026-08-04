import { useEffect, useState } from "react";
import { useParams, Link } from "react-router-dom";
import Error from "./Error";

const Details = () => {
  const { resource, id } = useParams();

  const [data, setData] = useState(null);
  const [error, setError] = useState(false);
  const [homeworld, setHomeworld] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch(`https://swapi.dev/api/${resource}/${id}`);

        if (!response.ok) {
          throw new Error();
        }

        const result = await response.json();

        setData(result);

        // Ninja Bonus
        if (resource === "people") {
          const planetResponse = await fetch(result.homeworld);

          const planet = await planetResponse.json();

          setHomeworld({
            name: planet.name,
            url: result.homeworld,
          });
        }
      } catch (err) {
        setError(true);
      }
    };

    fetchData();
  }, [resource, id]);

  if (error) {
    return <Error />;
  }

  if (!data) {
    return <h2>Loading...</h2>;
  }

  return (
    <div>
      <h1>{data.name}</h1>

      {resource === "people" ? (
        <>
          <p>Height: {data.height}</p>

          <p>Mass: {data.mass}</p>

          <p>Hair Color: {data.hair_color}</p>

          <p>Eye Color: {data.eye_color}</p>

          {homeworld && (
            <Link to={`/planets/${homeworld.url.split("/")[5]}`}>
              homeworld
            </Link>
          )}
        </>
      ) : (
        <>
          <p>Climate: {data.climate}</p>

          <p>Terrain: {data.terrain}</p>

          <p>Population: {data.population}</p>

          <p>Diameter: {data.diameter}</p>
        </>
      )}
    </div>
  );
};

export default Details;
