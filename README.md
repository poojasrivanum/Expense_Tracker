# Expense Tracker API

A simple REST API built using Java Spring Boot and MySQL to manage daily expenses.

## Features

- Add Expense
- Get All Expenses
- Update Expense
- Delete Expense
- Bulk Insert Expenses

---

# Tech Stack

- Java 21
- Spring Boot
- MySQL
- Spring Data JPA
- Maven
- Postman
- GitHub

---

# Project Structure

```bash
expense-tracker-api/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/expensetracker/
│       │       ├── controller/
│       │       ├── service/
│       │       ├── repository/
│       │       ├── model/
│       │       └── ExpenseTrackerApplication.java
│       │
│       └── resources/
│           └── application.properties
│
└── pom.xml
```

---

# API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/expenses` | Add single expense |
| POST | `/expenses/bulk` | Add multiple expenses |
| GET | `/expenses` | Get all expenses |
| PUT | `/expenses/{id}` | Update expense |
| DELETE | `/expenses/{id}` | Delete expense |

---

# Database Setup

Open MySQL and run:

```sql
CREATE DATABASE expensedb;
```

---

# Configure application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expensedb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
```

Replace:

```text
YOUR_PASSWORD
```

with your MySQL password.

---

# Run the Application

Run:

```text
ExpenseTrackerApplication.java
```

Application will start on:

```text
http://localhost:8080
```

---

# API Testing Using Postman

## 1. Add Expense

### POST

```http
http://localhost:8080/expenses
```

### Request Body

```json
{
  "title": "Pizza",
  "amount": 500,
  "category": "Food"
}
```

---

## 2. Bulk Insert Expenses

### POST

```http
http://localhost:8080/expenses/bulk
```

### Request Body

```json
[
  {
    "title": "Pizza",
    "amount": 500,
    "category": "Food"
  },
  {
    "title": "Uber",
    "amount": 200,
    "category": "Travel"
  },
  {
    "title": "Netflix",
    "amount": 799,
    "category": "Entertainment"
  }
]
```

---

## 3. Get All Expenses

### GET

```http
http://localhost:8080/expenses
```

---

## 4. Update Expense

### PUT

```http
http://localhost:8080/expenses/1
```

### Request Body

```json
{
  "title": "Burger",
  "amount": 300,
  "category": "Food"
}
```

---

## 5. Delete Expense

### DELETE

```http
http://localhost:8080/expenses/1
```

---

# Sample Response

```json
{
  "id": 1,
  "title": "Pizza",
  "amount": 500.0,
  "category": "Food"
}
```

---

# Concepts Used

- REST API
- CRUD Operations
- Spring Boot
- JPA/Hibernate
- MySQL Integration
- Layered Architecture

---

# Future Improvements

- User Authentication
- Expense Filtering
- Monthly Reports
- Swagger Documentation
- Docker Deployment

---

# Author

Your Name

---

# GitHub Repository Name

```text
expense-tracker-api
```
