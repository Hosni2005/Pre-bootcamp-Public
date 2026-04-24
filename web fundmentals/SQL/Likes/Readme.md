# Likes System Database - MySQL Workbench

## Project Overview
This project is a **Likes Social Media Database Model** created using **MySQL Workbench** with an **EER Diagram**.

The database is designed for a simple social media platform where users can create posts, like posts, and interact through comments.

---

## Tools Used
- MySQL Workbench
- MySQL Database Design
- EER Diagram

---

## Database Tables

### 1. User
Stores user account information.

**Fields:**
- user_id (PK)
- user-name
- icon
- email

---

### 2. Post
Stores user posts.

**Fields:**
- post_id (PK)
- date
- image-post
- paragraph
- user_id (FK)

---

### 3. Likes
Stores likes made by users on posts.

**Fields:**
- idlikes (PK)
- post_id (FK)
- user_id (FK)

---

### 4. Comments
Stores comments on posts.

**Fields:**
- comments_id (PK)
- post_id (FK)
- user_id (FK)

---

## Relationships
- One user can create many posts.
- One user can like many posts.
- One post can receive many likes.
- One user can comment on many posts.
- One post can have many comments.

---

## Features
- User profile data
- Post creation system
- Like system
- Comment system
- Relational database structure

---

## Skills Practiced
- Table creation
- Primary Keys & Foreign Keys
- One-to-Many relationships
- Database normalization
- MySQL Workbench modeling

---

## Screenshot
Database schema designed successfully using MySQL Workbench.

---

## Author
**Hosni Ahmad**