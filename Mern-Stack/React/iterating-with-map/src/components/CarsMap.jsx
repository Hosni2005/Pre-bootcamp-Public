import React from "react";

const CarMap = () => {
  const cars = [
    { id: 1, brand: "Toyota", year: 2024 },
    { id: 2, brand: "BMW", year: 2023 },
    { id: 3, brand: "Tesla", year: 2025 },
    { id: 4, brand: "Honda", year: 2022 },
  ];

  const fetchUsers = () => {
    return [
        { id: 1, firstName: "Murad", lastName: 'Shaheen' }
    ]
  }

  return (
    <div>
      <h2>Available Cars</h2>

      <ul>
        {cars.map((car) => {
          console.log("hello im in the map")
          return (
            <li key={car.id}>
              {car.brand} - {car.year}
            </li>
          );
        })}
      </ul>
    </div>
  );
};

export default CarMap;
