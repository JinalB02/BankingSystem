This is a Spring Boot application for a banking system that uses Spring Security for authentication and authorization. It includes a security configuration file that sets up CORS, CSRF protection, and authorization rules for specific endpoints.

## Installation
1. Clone the repository
2. Open the project in an IDE of your choice
3. Build the project using `mvn clean install`
4. Run the application using `mvn spring-boot:run`

## Usage
The application exposes several endpoints for managing bank accounts and transactions. The following endpoints are available:

- `/accounts` (GET): retrieves a list of all accounts
- `/accounts/{id}` (GET): retrieves the account with the specified ID
- `/accounts` (POST): creates a new account
- `/accounts/{id}` (PUT): updates the account with the specified ID
- `/accounts/{id}` (DELETE): deletes the account with the specified ID
- `/transactions` (GET): retrieves a list of all transactions
- `/transactions/{id}` (GET): retrieves the transaction with the specified ID
- `/transactions` (POST): creates a new transaction
- `/transactions/{id}` (PUT): updates the transaction with the specified ID
- `/transactions/{id}` (DELETE): deletes the transaction with the specified ID

To access the endpoints that require authentication, you will need to provide a valid JWT token in the `Authorization` header of your request. You can obtain a token by sending a POST request to `/authenticate` with a valid username and password in the request body.

## License
This project is licensed under the MIT License.

## Acknowledgements
This project was created using Spring Boot and Spring Security.

## Dependencies
- Spring Boot
- Spring Security
- Jakarta Servlet API
- Spring Web
- Spring Data JPA
- MySQL Connector Java
- jjwt

## Prerequisites
- Java 8 or higher
- MySQL server running on localhost:3306
- Maven

## Tools Needed
- IDE (IntelliJ IDEA, Eclipse, etc.)
- Postman (or any REST client) for testing

## API Documentation
API documentation can be found in the source code and generated using Swagger. To access the Swagger UI, navigate to `http://localhost:8080/swagger-ui.html` in your web browser.
