# Carrefour Java Kata

This project is a backend kata implemented in **Java 21** using **Spring Boot**, following **Clean Architecture** and **Domain-Driven Design (DDD)** principles. It includes order history retrieval and refund request submission features.

---

## Features (MVP)

- **View Order History**  
  As a customer, I can view the history of my orders.

- **Submit Refund Request**  
  As a customer, I can request a refund for a specific product and provide a description and picture evidence.

---

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Liquibase (database schema migration)
- Docker
- PostgreSQL
- Clean Architecture
- DDD (Domain-Driven Design)
- Maven

---

## How to Run the Project

To run the project locally with Docker, follow these steps:

### Prerequisites

- Ensure Docker and Docker Compose are installed on your machine. You can check by running the following commands:

    ```bash
    docker --version
    docker-compose --version
    ```

### Steps to Run

1. **Clone the Repository**:

    ```bash
    git clone https://gitlab.com/fr_kata_sf/c4-SF-0318-SQ01.git
    cd c4-SF-0318-SQ01
    ```

2. **Build and Start the Docker Containers**:

   Run the following command to build and start the Docker containers:

    ```bash
    docker-compose up --build -d
    ```

   This will:
    - Build the application image from the `Dockerfile`.
    - Start the required services: PostgreSQL and the application.


3. **Access the Application**:

   The application will be available on `http://localhost:8080`.
