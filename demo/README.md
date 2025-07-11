# Spring Boot CRUD API

Bu proje, Spring Boot kullanılarak geliştirilen basit bir RESTful CRUD API uygulamasıdır. PostgreSQL veritabanı ile ürün yönetimi yapılmaktadır.

## 🚀 Özellikler

- Ürün ekleme (Create)
- Ürün listeleme (Read)
- Ürün güncelleme (Update)
- Ürün silme (Delete)
- H2 yerine gerçek veritabanı: PostgreSQL
- Spring Data JPA
- Spring Boot 3.x
- JSON veri ile iletişim

## 🛠️ Teknolojiler

- Java 23
- Spring Boot 3.5.3
- Spring Data JPA
- PostgreSQL
- Maven
- Hibernate
- Lombok

## ⚙️ Uygulama Yapısı
```
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
```