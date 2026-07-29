import { useState } from "react";
import styles from "./PersonCard.module.css"
const PersonCard = (props) => {
  const { firstName, lastName, age: propAge, hairColor } = props;

  const [age, setAge] = useState(propAge);
  const increaseAge = () => {
    setAge(age+1);
  };
  return (

    <div className={styles.btn}>
      <h2>
        {firstName} {lastName}{" "}
      </h2>
      <p>Age : {age}</p>
      <p>Hair Color: {hairColor}</p>

      <button onClick={increaseAge}>
        Birthday Button for {firstName} {lastName}
      </button>
    </div>

  
  );
};
export default PersonCard;
