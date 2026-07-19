# ☕ Cafe Management System — Backend (Spring Boot)

A production-grade **Cafe Management System** built with Java Spring Boot and Microservices architecture. This backend powers all core cafe operations including menu management, customer handling, order processing, billing, cart, and payments — secured with JWT-based authentication.

---

## 🚀 Features

- 🔐 JWT Authentication & Role-Based Access Control (Admin / Customer)
- 📋 Menu Management — add, update, delete, view items
- 👤 Customer Registration & Profile Management
- 🛒 Cart Operations — add/remove items, auto total calculation
- 📦 Order Management — place, track, and update orders
- 💳 Payment & Billing Module
- 📄 API Documentation with Swagger/OpenAPI
- 🗃️ Database Integration with MySQL via Spring Data JPA & Hibernate

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 3.x |
| Security | Spring Security + JWT |
| ORM | Hibernate + Spring Data JPA |
| Database | MySQL |
| Build Tool | Maven |
| API Docs | Swagger / OpenAPI |
| Architecture | Microservices / REST APIs |

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── controller/     # REST API Controllers
│   │   ├── service/        # Business Logic
│   │   ├── repository/     # JPA Repositories
│   │   ├── model/          # Entity Classes
│   │   ├── dto/            # Data Transfer Objects
│   │   ├── security/       # JWT & Spring Security Config
│   │   └── config/         # App Configuration
│   └── resources/
│       └── application.properties
```

---

## ⚙️ Setup & Run

### Prerequisites
- Java 17+
- MySQL 8+
- Maven 3.6+

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/srijarayikanti/Cafe_management_system_java_springboot.git
cd Cafe_management_system_java_springboot

# 2. Create MySQL database
CREATE DATABASE cafe_management;

# 3. Update application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/cafe_management
spring.datasource.username=your_username
spring.datasource.password=your_password

# 4. Build and run
mvn clean install
mvn spring-boot:run
```

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/auth/register` | Register new user |
| POST | `/api/auth/login` | Login & get JWT token |
| GET | `/api/menu` | Get all menu items |
| POST | `/api/cart/add` | Add item to cart |
| POST | `/api/order/place` | Place an order |
| GET | `/api/order/{id}` | Get order details |
| POST | `/api/payment` | Process payment |

> Full API docs available at: `http://localhost:8080/swagger-ui.html`

---

## 🔗 Related Repositories

- **Frontend (React UI):** [cafe-ui](https://github.com/srijarayikanti/cafe-ui)
- **Cafe Online Module:** [cafe_online](https://github.com/srijarayikanti/cafe_online)

---

## 👩‍💻 Author

**Rayikanti Srija** — Java Backend Developer  
[GitHub](https://github.com/srijarayikanti) | [LinkedIn](https://linkedin.com/in/srija-srinivas-593121238/)
