# ORM Fundamental – JPA / Hibernate (Maven)

This project demonstrates **basic ORM concepts** using **Jakarta Persistence (JPA)** with **Hibernate** as the provider.
The goal is to understand how Java objects are mapped to relational database tables.

---

## 📁 Project Structure (Pseudo Code)

MavenProject1
│
├── pom.xml
│ └── Maven configuration
│ - Java version
│ - Dependencies (jakarta.persistence, hibernate, mysql)
│
├── src
│ ├── main
│ │ ├── java
│ │ │ └── bmt
│ │ │ ├── MainApp.java
│ │ │ │ └── Application entry point
│ │ │ │ └── Creates EntityManager
│ │ │ │ └── Persists entities to database
│ │ │ │
│ │ │ ├── User.java
│ │ │ │ └── @Entity
│ │ │ │ └── Maps to table: Users
│ │ │ │ └── Fields: id, name, email
│ │ │ │
│ │ │ └── Product.java
│ │ │ └── @Entity
│ │ │ └── Maps to table: Products
│ │ │ └── Fields: id, name, price
│ │ │
│ │ └── resources
│ │ └── META-INF
│ │ └── persistence.xml
│ │ └── JPA configuration
│ │ └── Database connection
│ │ └── Hibernate properties
│ │
│ └── test
│ └── java
│ └── bmt
│ └── (unit tests - optional)
│
├── target
│ ├── classes
│ │ └── Compiled .class files
│ └── test-classes
│
└── README.md


---

## 🧠 Core Concepts Covered

- ORM (Object Relational Mapping)
- JPA annotations:
  - `@Entity`
  - `@Id`
  - `@GeneratedValue`
  - `@Table`
- Entity lifecycle
- `EntityManager` & `EntityTransaction`
- Mapping Java classes to MySQL tables

---



