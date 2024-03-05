# Pet Management System
The Pet Management System is a Spring Boot application that allows users to perform CRUD operations to manage pet records stored in an H2 database.


### Components :-
+ **controller/:** Contains the PetController class responsible for handling incoming HTTP requests and delegating to the appropriate service methods.
+ **model/:** Defines the Pet class representing the structure of a pet record.
+ **repository/:** Includes the PetRepository interface for database operations.
+ **service/:** Contains the PetService class that implements the business logic for CRUD operations on pet records.
+ **exception/:** Defines the PetNotFoundException class for handling exceptions when a pet is not found.
+ **PetManagementSystemApplication.java:** The main class to start the Spring Boot application.
+ **resources/:** Contains application properties and static resources.

### Usage :-
To run the Pet Management System:

1. Ensure you have Java and Maven installed on your system.
2. Clone this repository.
3. Navigate to the project directory.
4. Run mvn spring-boot:run to start the application.
5. Access the application at http://localhost:8080.
   
### Dependencies :-
This project requires the following dependencies:

1. Spring Boot
2. H2 Database
3. Spring Web
These dependencies are managed using Maven.

### API Endpoints :-
The following API endpoints are available:

+ **GET /pets:** Get all pet records.
+ **GET /pets/{id}:** Get a pet record by ID.
+ **POST /pets:** Add a new pet record.
+ **PUT /pets/{id}:** Update an existing pet record.
+ **DELETE /pets/{id}:** Delete a pet record by ID.
  
### Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request.

###Happy coding! 🚀###
