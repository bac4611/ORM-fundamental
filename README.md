## 📁 Project Structure

MavenProject1
│
├── pom.xml
│ ├── Maven configuration
│ ├── Java version
│ └── Dependencies
│ ├── jakarta.persistence
│ ├── hibernate
│ └── mysql
│
├── src
│ ├── main
│ │ ├── java
│ │ │ └── bmt
│ │ │ ├── MainApp.java
│ │ │ │ ├── Application entry point
│ │ │ │ ├── Creates EntityManager
│ │ │ │ └── Persists entities to database
│ │ │ │
│ │ │ ├── User.java
│ │ │ │ ├── @Entity
│ │ │ │ ├── Maps to table: Users
│ │ │ │ └── Fields: id, name, email
│ │ │ │
│ │ │ └── Product.java
│ │ │ ├── @Entity
│ │ │ ├── Maps to table: Products
│ │ │ └── Fields: id, name, price
│ │ │
│ │ └── resources
│ │ └── META-INF
│ │ └── persistence.xml
│ │ ├── JPA configuration
│ │ ├── Database connection
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

