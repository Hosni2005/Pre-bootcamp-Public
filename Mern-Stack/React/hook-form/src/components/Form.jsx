import { useState } from "react";


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

  return (
    <form>
      <div>
        <label htmlFor="firstName">firstName</label>
        <input
          type="text"
          name="firstName"
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
        <label htmlFor="lastName">lastName</label>
        <input
          type="text"
          name="lastName"
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
          name="Email"
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
          name="Password"
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
        <label htmlFor="confirmPassword">confirmPassword</label>

        <input
          type="password"
          name="confirmPassword"
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

      <hr />

      <h2>Your Form Data</h2>

      <p>First Name: {firstName}</p>
      <p>Last Name: {lastName}</p>
      <p>Email: {Email}</p>
      <p>Password: {Password}</p>
      <p>Confirm Password: {confirmPassword}</p>
    </form>
  );
};

export default Form;
