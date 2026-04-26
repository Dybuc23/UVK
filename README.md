# UVK Service

A RESTful backend service built with **Java**, **Spring Boot 2.6**, and **MySQL**. Developed to practice layered REST API architecture with JPA persistence and Lombok.

## Tech Stack

|Layer      |Technology                 |
|-----------|---------------------------|
|Language   |Java                       |
|Framework  |Spring Boot 2.6.6          |
|Persistence|Spring Data JPA / Hibernate|
|Database   |MySQL                      |
|Utilities  |Lombok                     |
|Build Tool |Maven                      |

## Features

- 🌐 **REST API** — standard HTTP endpoints with JSON request/response
- 🗄️ **JPA persistence** — entity management with Spring Data repositories
- 🏗️ **Layered architecture** — Controller → Service → Repository pattern
- ⚡ **Lombok** — boilerplate-free entity and DTO definitions

## Project Structure

```
src/
└── main/
    └── java/
        └── pe/com/uvk/
            ├── controller/    # REST controllers
            ├── service/       # Business logic
            ├── repository/    # JPA repositories
            └── model/         # JPA entities
```

## Getting Started

### Prerequisites

- Java 8+
- MySQL 8+
- Maven 3.6+

### Setup

1. Clone the repo:

   ```bash
   git clone https://github.com/Dybuc23/UVK.git
   cd UVK
   ```
1. Create the database:

   ```sql
   CREATE DATABASE uvkdb;
   ```
1. Configure `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/uvkdb
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
1. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

The API will be available at `http://localhost:8080`.

## What I Learned

- Building REST services with Spring Boot from scratch
- Applying the repository pattern using `JpaRepository`
- Managing entity relationships and persistence with JPA/Hibernate
- Keeping code clean and concise with Lombok annotations
