# Faker API

A simple REST API built with **Node.js**, **Express**, and **@faker-js/faker** that generates random **User** and **Company** objects. This project demonstrates the basics of creating API endpoints and returning dynamically generated JSON data.

---

## Technologies Used

* Node.js
* Express.js
* @faker-js/faker
* Nodemon
* Postman (for testing)

---

## Installation

1. Clone the repository.

```bash
git clone <your-repository-url>
```

2. Navigate to the project folder.

```bash
cd Faker_API
```

3. Install the dependencies.

```bash
npm install
```

4. Start the server.

```bash
npm run dev
```

The server will start on:

```text
http://localhost:8000
```

---

## API Endpoints

### Create a New User

**GET**

```text
/api/users/new
```

Returns a randomly generated user object.

---

### Create a New Company

**GET**

```text
/api/companies/new
```

Returns a randomly generated company object.

---

### Create a New User and Company

**GET**

```text
/api/user/company
```

Returns both a random user and a random company.

---

## Example Response

```json
{
  "user": {
    "_id": "12345",
    "firstName": "John",
    "lastName": "Doe",
    "phoneNumber": "555-123-4567",
    "email": "john@example.com",
    "password": "password123"
  },
  "company": {
    "_id": "67890",
    "name": "Tech Solutions",
    "address": {
      "street": "123 Main Street",
      "city": "New York",
      "state": "New York",
      "zipCode": "10001",
      "country": "United States"
    }
  }
}
```

---

# Screenshots

## 1. GET /api/users/new

![User Route](/images/1.png)

---

## 2. GET /api/companies/new

![Company Route](/images/2.png)

---

## 3. GET /api/user/company

![User and Company Route](/images/3.png)

---

## Project Structure

```text
Faker_API/
│── node_modules/
│── server.js
│── package.json
│── package-lock.json
│── README.md
└── images/
    ├── user-route.png
    ├── company-route.png
    └── user-company-route.png
```

---

## Author

Hosni Ahmad
