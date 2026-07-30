const FormData = ({
  firstName,
  lastName,
  Email,
  Password,
  confirmPassword,
}) => {
  return (
    <>
      <hr />

      <h2>Your Form Data</h2>

      <p>First Name: {firstName}</p>
      <p>Last Name: {lastName}</p>
      <p>Email: {Email}</p>
      <p>Password: {Password}</p>
      <p>Confirm Password: {confirmPassword}</p>
    </>
  );
};

export default FormData;