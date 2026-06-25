# 🛒 E-Commerce Backend System

A scalable and secure E-Commerce Backend application built using Spring Boot, MySQL, JWT Authentication, and REST APIs. This project demonstrates industry-standard backend development practices including authentication, cart management, order processing, payment simulation, exception handling, and API documentation.


### 🔐 Authentication & Security
- User Registration and Login
- JWT Token Generation
- Spring Security Integration
- Role-based User Support (USER/ADMIN)

### 📦 Product Management
- Create, Read, Update, Delete (CRUD) Products
- Category-wise Product Organization
- Pagination and Sorting Support

### 🛒 Shopping Cart
- Add Products to Cart
- Update Product Quantity
- Remove Products from Cart
- View Complete Cart Details

### 📋 Order Management
- Place Orders
- Order History APIs
- Order Status Tracking

### 💳 Payment Module
- Payment Processing Simulation
- Payment Status Management

### 📊 Dashboard APIs
- Total Users
- Total Products
- Total Orders
- Business Statistics Endpoints

### ⚠️ Exception Handling
- Global Exception Handler
- Custom Error Responses
- Validation Support

### 📄 API Documentation
- Interactive Swagger UI Documentation

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|----------|
| Java 21 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Security | Authentication & Authorization |
| JWT | Token-based Authentication |
| Spring Data JPA | Database Operations |
| MySQL | Relational Database |
| Maven | Dependency Management |
| Swagger/OpenAPI | API Documentation |
| Git & GitHub | Version Control |

---

## 📂 Project Structure

```text
src/main/java/com/pawni/ecommerce
│
├── config        # Application & Security Configuration
├── controller    # REST APIs
├── DTO           # Request & Response Objects
├── entity        # Database Entities
├── exception     # Global Exception Handling
├── repository    # JPA Repositories
├── security      # JWT Utilities & Security Classes
└── service       # Business Logic
```

---

## 📖 API Documentation

After running the application:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## ⚙️ Setup Instructions

### Clone Repository

```bash
git clone https://github.com/pawni37-art/ecommerce-backend-springboot.git
```

### Create Database

```sql
CREATE DATABASE ecommerce_db;
```

### Configure Database Credentials

Update:

```properties
src/main/resources/application.properties
```

```properties
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### Run Application

```bash
mvn spring-boot:run
```

---

## 🎯 Learning Outcomes

This project helped in understanding:

- REST API Design
- Spring Boot Architecture
- JWT Authentication
- Database Modeling with JPA
- Exception Handling
- API Documentation using Swagger
- Git & GitHub Workflow
- Layered Backend Development

---

## 👩‍💻 Author

**Pawni Mishra**

GitHub: https://github.com/pawni37-art
