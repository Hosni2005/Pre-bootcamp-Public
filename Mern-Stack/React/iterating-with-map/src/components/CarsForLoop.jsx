import React from "react";

const CarForLoop = () => {
  const cars = [
    { id: 1, brand: "Toyota", year: 2024 },
    { id: 2, brand: "BMW", year: 2023 },
    { id: 3, brand: "Tesla", year: 2025 },
    { id: 4, brand: "Honda", year: 2022 },
    { id: 5, brand: "Mercedes", year: 2019 },
  ];

  const carItems = [];

  for (let i = 0; i < cars.length; i++) {
    carItems.push(
      <li key={cars[i].id}>
        {cars[i].id} . {cars[i].brand} - {cars[i].year}
        
      </li>
    );
  }

  return (
    <div>
      <h2>Cars using for loop</h2>
      <ul>{carItems}</ul>
    </div>
  );
};

export default CarForLoop;