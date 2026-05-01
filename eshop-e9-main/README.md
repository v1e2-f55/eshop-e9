# 🛒 E-Shop Application (Spring Boot)

A full-stack **E-commerce backend application** built using **Spring Boot** that provides secure user authentication, product management, and role-based access control using JWT.

---

## 🚀 Features

* 🔐 User Authentication & Authorization (JWT based)
* 👤 Role-based access (Admin / User)
* 🛍️ Product Management (Add, Update, Delete, View)
* 📦 RESTful APIs for seamless integration
* ⚡ Exception Handling (Global Exception Handler)
* 🔑 Secure endpoints using Spring Security

---

## 🛠️ Tech Stack

* **Backend:** Spring Boot
* **Security:** Spring Security + JWT
* **Database:** (Update this → MySQL / H2 if used)
* **Build Tool:** Maven
* **Language:** Java
* **Architecture:** MVC (Controller, Service, Repository)

---

## 📂 Project Structure

```
src/
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── security
 └── exception
```

---

## ⚙️ How to Run

### 1️⃣ Clone the repository

```
git clone https://github.com/v1e2-f55/eshop-e9.git
```

### 2️⃣ Navigate into project

```
cd eshop-e9
```

### 3️⃣ Run the application

Using Maven:

```
mvn spring-boot:run
```

Or run the main class:

```
ShoppingApplication.java
```

---

## 🔑 API Authentication

* Register/Login to get JWT token
* Use token in headers:

```
Authorization: Bearer <your_token>
```

---

## 📸 Screenshots (Optional)

*Add screenshots here if you have UI or API testing images*

---

## 📌 Future Improvements

* 🛒 Add Cart & Order module
* 💳 Payment Integration
* 🌐 Frontend (React / Angular)
* 📊 Admin Dashboard

---

## 👨‍💻 Author

**Veeresh Hulsogi**
GitHub: https://github.com/v1e2-f55

---

## ⭐ Show your support

If you like this project, give it a ⭐ on GitHub!

