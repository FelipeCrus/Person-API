# People Manager API

A RESTful API developed with **Java 17** and **Spring Boot**, designed to manage people, validate personal data, and support CRUD operations with best practices in architecture and DTO-based communication.

This project was built during a **Digital Innovation One (DIO) Live Coding session**, instructed by **Rodrigo Peleias**.

---

## 🚀 Overview

The People Manager API provides structured endpoints for creating, updating, retrieving, and deleting person records. The system uses **DTOs**, **MapStruct**, and **Bean Validation** to ensure clean data flow and proper validation, such as CPF format checking.

---

## 🛠️ Technologies

* Java 17
* Spring Boot 3.x
* Spring Web
* Spring Data JPA
* Hibernate Validator / Jakarta Validation
* MapStruct
* H2 / PostgreSQL (depending on configuration)

---

## 📌 Features

* Create, list, update, and delete people
* Automatic DTO-to-entity mapping with **MapStruct**
* Validation of personal data (e.g., `@CPF`, name length, non-empty fields)
* Clean architecture with separated layers (Controller → Service → Repository)

---

## 📐 Project Structure

```
src/
 └── main/
     ├── java/
     │   └── people.manager.personapi
     │       ├── controller/
     │       ├── service/
     │       ├── repository/
     │       ├── dto/
     │       ├── entity/
     │       └── mapper/
     └── resources/
         └── application.properties
```

---

## 🔥 Endpoints

| Method | Route                 | Description               |
| ------ | --------------------- | ------------------------- |
| POST   | `/api/v1/people`      | Create a new person       |
| GET    | `/api/v1/people`      | List all people           |
| GET    | `/api/v1/people/{id}` | Find person by ID         |
| PUT    | `/api/v1/people/{id}` | Update an existing person |
| DELETE | `/api/v1/people/{id}` | Delete a person by ID     |

---

## 🧪 Validation

The API applies several validation rules:

* `@NotEmpty` for mandatory fields
* `@Size` for name length constraints
* `@CPF` for valid CPF numbers
* `@Valid` for nested objects (e.g., phone list)

Requests that do not meet validation rules return **400 Bad Request** with detailed error descriptions.

---

## 📦 Running the Project

### Maven

```bash
mvn spring-boot:run
```

### Gradle

```bash
gradle bootRun
```

Server runs on:

```
http://localhost:8080
```

---

## 🤝 Contribution

Feel free to open issues or submit pull requests.

---

## 📄 License

This project is released under the **MIT License**. You are free to use and modify it.

---

> **Note:** This API was developed as part of a **DIO (Digital Innovation One) Live Coding** session, instructed by **Rodrigo Peleias**, focusing on Spring Boot fundamentals and clean REST architecture.
