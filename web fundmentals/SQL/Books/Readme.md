# Library Database ER Diagram

## Overview
This project is a simple **MySQL Workbench EER Diagram** for a library database system.  
It shows the relationships between users, books, authors, and favorite books.

## Tables

### users
Stores user information.
- user-id (Primary Key)
- user-name

### authors
Stores author details.
- author-id (Primary Key)
- author-name

### books
Stores book information.
- book-id (Primary Key)
- book-title
- author-id (Foreign Key)

### favorite-books
Stores users' favorite books.
- fav-id (Primary Key)
- book-id (Foreign Key)
- user-id (Foreign Key)

## Relationships
- One author can have many books.
- One book belongs to one author.
- One user can have many favorite books.
- One book can be favorited by many users.

## Tools Used
- MySQL Workbench
- EER Diagram Modeling

## Purpose
This assignment helps understand:
- Database design
- Primary Keys and Foreign Keys
- One-to-Many relationships
- Many-to-Many relationships
