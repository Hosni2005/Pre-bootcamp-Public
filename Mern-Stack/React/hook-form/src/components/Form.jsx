import { useState } from "react";
import FormData from "./FormData";

const Form = () => {
  const [firstName, setfirstName] = useState("");
  const [firstNameErorr, setfirstNameErorr] = useState("");

  const [lastName, setlastName] = useState("");
  const [lastNameErorr, setlastNameErorr] = useState("");

  const [Email, setEmail] = useState("");
  const [EmailErorr, setEmailErorr] = useState("");

  const [Password, setPassword] = useState("");
  const [PasswordErorr, setPasswordErorr] = useState("");

  const [confirmPassword, setconfirmPassword] = useState("");
  const [confirmPasswordErorr, setconfirmPasswordErorr] = useState("");

  const [showData, setShowData] = useState(false);


  return (
    <form>
      <div>
        <label htmlFor="firstName">First Name</label>
        <input
          type="text"
          id="firstName"
          value={firstName}
          onChange={(e) => {
            setfirstName(e.target.value);

            if (e.target.value.length <= 2) {
              setfirstNameErorr("Must be longer than 2 characters");
            } else {
              setfirstNameErorr("");
            }
          }}
        />

        <p>{firstNameErorr}</p>
      </div>


      <div>
        <label htmlFor="lastName">Last Name</label>
        <input
          type="text"
          id="lastName"
          value={lastName}
          onChange={(e) => {
            setlastName(e.target.value);

            if (e.target.value.length <= 2) {
              setlastNameErorr("Must be longer than 2 characters");
            } else {
              setlastNameErorr("");
            }
          }}
        />

        <p>{lastNameErorr}</p>
      </div>


      <div>
        <label htmlFor="Email">Email</label>
        <input
          type="email"
          id="Email"
          value={Email}
          onChange={(e) => {
            setEmail(e.target.value);

            if (e.target.value.length <= 2) {
              setEmailErorr("Must be longer than 2 characters");
            } else {
              setEmailErorr("");
            }
          }}
        />

        <p>{EmailErorr}</p>
      </div>


      <div>
        <label htmlFor="Password">Password</label>
        <input
          type="password"
          id="Password"
          value={Password}
          onChange={(e) => {
            setPassword(e.target.value);

            if (e.target.value.length <= 8) {
              setPasswordErorr("Must be longer than 8 characters");
            } else {
              setPasswordErorr("");
            }
          }}
        />

        <p>{PasswordErorr}</p>
      </div>


      <div>
        <label htmlFor="confirmPassword">Confirm Password</label>

        <input
          type="password"
          id="confirmPassword"
          value={confirmPassword}
          onChange={(e) => {
            setconfirmPassword(e.target.value);

            if (e.target.value.length <= 8) {
              setconfirmPasswordErorr("Must be longer than 8 characters");
            } else {
              setconfirmPasswordErorr("");
            }
          }}
        />

        <p>{confirmPasswordErorr}</p>
      </div>


      <button
        type="button"
        onClick={() => setShowData(!showData)}
      >
        {showData ? "Hide Data" : "Show Data"}
      </button>


      {showData && (
        <FormData
          firstName={firstName}
          lastName={lastName}
          Email={Email}
          Password={Password}
          confirmPassword={confirmPassword}
        />
      )}

    </form>
  );
};

export default Form;