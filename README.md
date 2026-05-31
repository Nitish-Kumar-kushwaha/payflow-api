PayFlow is a simplified fintech backend application built using Spring Boot.

The application allows users to:
- Register users
- Search users by ID and UPI ID
- View all users
- Record money transfer transactions

The project demonstrates REST APIs, Spring Data JPA, H2 Database, and layered architecture.

## Technologies

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Project Structure

entity
repository
service
controller

## Layers

### Entity Layer
Represents database tables.

### Repository Layer
Handles database operations.

### Service Layer
Contains business logic.

### Controller Layer
Handles HTTP requests and responses.

## Spring Boot Features

1. Embedded Server
   - Tomcat runs automatically.

2. Auto Configuration
   - Spring configures database and web server automatically.

3. Production Ready Defaults
   - Health checks, logging and configuration support.

## Run

1. Clone repository
2. Open in IntelliJ
3. Run PayflowApiApplication.java
4. Open:

http://localhost:8080

