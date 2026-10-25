# Enterprise Customer Service API

A production-grade Spring Boot microservice designed to manage enterprise customer profiles. This service serves as the foundational data layer for a larger billing and payment backend system, implementing a strict layered architecture to ensure clean separation of concerns and maintainability.

### Tech Stack
* **Language:** Java 17
* **Framework:** Spring Boot 3, Spring Web
* **Data Access:** Spring Data JPA, Hibernate
* **Database:** PostgreSQL
* **Tools:** IntelliJ IDEA, Postman, Git

### Architecture Overview
This microservice utilizes a robust layered architecture:
* **Controller Layer:** Exposes RESTful endpoints and handles HTTP requests.
* **Facade Layer:** Orchestrates business logic and isolates controllers from direct service dependencies.
* **Service Layer:** Contains core business logic (`CustomerServiceImpl`).
* **Data Transfer Objects (DTOs):** Secures data payloads and prevents internal entity exposure using a dedicated `CustomerMapper`.
* **Repository Layer:** Manages database operations via Spring Data JPA (`CustomerEnity`).

### API Endpoints
* `POST /create-customers` - Creates a new customer record.
* `GET /getCustomers` - Retrieves all existing customers.

### Local Setup
1. Clone the repository: `git clone https://github.com/kumariaadya1019/customer-service.git`
2. Update `src/main/resources/application.properties` with your local PostgreSQL credentials.
3. Build the project: `mvn clean install
4. Run the application: `mvn spring-boot:run
