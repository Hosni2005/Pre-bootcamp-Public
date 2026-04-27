# Belts Database ERD

## Overview
This project is a simple **Entity Relationship Diagram (ERD)** created using **MySQL Workbench**.  
It represents a certification system where users can earn different belts through certifications.

## Database Structure

The database contains **3 tables**:

### 1. Users
Stores user information.

| Column Name | Data Type |
|------------|----------|
| user_id | INT (PK) |
| user_name | VARCHAR(50) |
| age | INT |

### 2. Belts
Stores available belt levels.

| Column Name | Data Type |
|------------|----------|
| belt_id | INT (PK) |
| belt_name | VARCHAR(45) |

### 3. Certification
Acts as a junction table connecting users with belts.

| Column Name | Data Type |
|------------|----------|
| id | INT (PK) |
| user_id | INT (FK) |
| belt_id | INT (FK) |

## Relationships

- One **User** can have many certifications.
- One **Belt** can be assigned to many users.
- The **Certification** table links users and belts.

## Tools Used

- MySQL Workbench
- ER Diagram Design

## Purpose

This assignment demonstrates:

- Creating tables
- Using Primary Keys
- Using Foreign Keys
- Building relationships between tables
- Designing ERD in MySQL Workbench

## Author

Hosni Ahmad