# Wappnet_Design
This is a simple Spring Boot project that demonstrates a one-to-many relationship between `Author` and `Book` entities. The project includes CRUD operations for both entities.

## Prerequisites

- [Java JDK](https://adoptopenjdk.net/)
- [Postman](https://www.postman.com/) (for testing API endpoints)r 
- [MySql WorkBench](https://www.mysql.com/products/workbench/) (for connecting to the local database)

## Database Configuration

1. Configure the database details in the `application.properties` file.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

**Running the Application**
Start the Spring Boot application.
./mvnw spring-boot:run


**API Endpoints**
Authors
GET /authors: Retrieve all authors.
GET /authors/{id}: Retrieve an author by ID.
POST /authors: Create a new author.
PUT /authors/{id}: Update an author by ID.
DELETE /authors/{id}: Delete an author by ID.
Books
GET /books: Retrieve all books.
GET /books/{id}: Retrieve a book by ID.
POST /books: Create a new book.
PUT /books/{id}: Update a book by ID.
DELETE /books/{id}: Delete a book by ID.
