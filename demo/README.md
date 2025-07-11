# 📦 CRUD Product Management API

This is a **simple CRUD application** developed using Spring Boot. It allows basic product management operations such as creating, reading, updating, and deleting products. The application uses PostgreSQL as the database.

---

## ⚙️ Technologies Used

- Java 23
- Spring Boot 3.5.3
- Spring Web
- Spring Data JPA
- PostgreSQL
- HikariCP
- Lombok
- Hibernate
- Maven

---

## 🧱 Project Structure

```text
demo/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── ecommerce/
│       │               ├── controller/
│       │               │   └── ProductController.java
│       │               ├── dto/
│       │               │   └── ProductDto.java
│       │               ├── entity/
│       │               │   └── Product.java
│       │               ├── mapper/
│       │               │   └── ProductMapper.java
│       │               ├── repository/
│       │               │   └── ProductRepository.java
│       │               ├── service/
│       │               │   ├── ProductService.java
│       │               │   └── ProductServiceImpl.java
│       │               └── EcommerceApplication.java
│       └── resources/
│           ├── application.properties
│           └── ...
├── pom.xml
└── README.md
