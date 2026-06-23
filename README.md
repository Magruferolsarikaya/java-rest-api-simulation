# 🌐 Java REST API & JSON Serialization Simulator

This project is a foundational simulation of a backend REST API built entirely in plain Java. It demonstrates the core mechanics of how modern web frameworks (like Spring Boot) handle incoming HTTP requests and serialize complex Java objects into standardized JSON payloads for client consumption.

## 🚀 Key Features & Concepts
* **Manual JSON Serialization:** The `Subscription` model is equipped with a custom `toJson()` method, illustrating the raw mechanics of converting Java object states into valid JSON strings without relying on external libraries like Jackson or Gson.
* **RESTful Endpoint Routing:** The `ApiController` simulates a web server environment, intercepting mock GET requests to specific endpoints (e.g., `/api/subscriptions`) and returning appropriate responses or `404 Not Found` errors for invalid routes.
* **Memory & Performance Optimization:** Utilizes Java's `StringBuilder` within iteration loops to efficiently construct large JSON arrays, strictly avoiding the performance pitfalls of standard string concatenation.

## 🛠️ Technologies
* **Language:** Java (JDK 8+)
* **Architecture:** Mock REST Controller, Data Serialization (Model-to-JSON)
* **Data Structures:** `ArrayList`, `StringBuilder`

## 🏃‍♂️ How to Run
1. Clone this repository:
   ```bash
   git clone [https://github.com/Magruferolsarikaya/java-rest-api-simulation.git](https://github.com/Magruferolsarikaya/java-rest-api-simulation.git)
