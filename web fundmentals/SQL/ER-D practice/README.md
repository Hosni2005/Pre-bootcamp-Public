# ERD Practice - Group Assignment

## Assignment Description
This assignment is about practicing how to create Entity Relationship Diagrams (ERDs) for real-world database examples.

Students worked in groups of no more than four members and designed ERDs on a whiteboard. The goal was to understand entities, attributes, and the different types of relationships between them.

## ERD Examples

### 1. User
A user has:
- Name
- Email address
- Creation date

**Entity:** User

---

### 2. Country and Flag
Each flag represents only one country.

**Relationship:**  
Country → Flag  
One-to-One relationship

---

### 3. City and School
Every school has a city, but some cities can have multiple schools.

**Relationship:**  
City → School  
One-to-Many relationship

---

### 4. Author and Book
A book has a title and an author.  
An author can write many books.

**Relationship:**  
Author → Book  
One-to-Many relationship

---

### 5. Class and Student
A class can have multiple students, and one student can attend multiple classes.

**Relationship:**  
Student ↔ Class  
Many-to-Many relationship

---

### 6. Applicant and Job
Each applicant has a resume, and each job has multiple start dates.  
An applicant can apply to more than one job, and a job can have many applicants.

**Relationship:**  
Applicant ↔ Job  
Many-to-Many relationship

This relationship can be solved using an intermediate table called `Application`.

## What I Learned
- How to identify entities
- How to add attributes to entities
- How to recognize relationship types
- How to use one-to-one, one-to-many, and many-to-many relationships
- How to use a junction table for many-to-many relationships

## Technologies / Tools
- Whiteboard
- ERD concepts
- Database design basics