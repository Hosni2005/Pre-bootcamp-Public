# Simple Blog Database - MySQL Workbench

## Project Overview
This project is a **Simple Blog Database Model** created using **MySQL Workbench** and represented with an **EER Diagram**.

The system is designed to manage users, posts, comments, and login/registration data for a blog website.

---

## Tools Used
- MySQL Workbench
- EER Diagram
- MySQL Database Design

---

## Database Tables

### 1. Users
Stores user account information.

**Fields:**
- user-id (PK)
- user-name
- password
- email

---

### 2. Posts
Stores blog posts created by users.

**Fields:**
- post-id (PK)
- content
- user-id (FK)
- time

---

### 3. Comments
Stores comments added to posts.

**Fields:**
- comments-id (PK)
- comment-info
- time
- post-id (FK)
- user-id (FK)

---

### 4. Registration and Login
Stores login credentials for users.

**Fields:**
- email
- password
- user-name

---

## Relationships
- One user can create many posts.
- One user can write many comments.
- One post can have many comments.
- Comments belong to both users and posts.

---

## Skills Practiced
- Database modeling
- Primary Keys & Foreign Keys
- Table relationships
- EER diagram creation
- MySQL Workbench usage

---

## Screenshot
Database schema designed successfully in MySQL Workbench.
![Schema Screenshot](Screenshot%202026-04-24%20145538.png)

---

## Author
**Hosni Ahmad**