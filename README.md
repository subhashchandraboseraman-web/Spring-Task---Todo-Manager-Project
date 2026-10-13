# TaskFlow - Task Management REST API

A REST API built with Java, Spring Boot, Spring Data JPA, Maven, and H2.

## Features
- Create, read, update, and delete tasks
- Update task status
- Filter tasks by status and priority

## Run the application
```bash
mvn spring-boot:run
```

## API Endpoints
- POST /api/tasks - Create a task
- GET /api/tasks - List tasks
- GET /api/tasks/{id} - Get a task
- PUT /api/tasks/{id} - Update a task
- PATCH /api/tasks/{id}/status - Change status
- DELETE /api/tasks/{id} - Delete a task

## Database
H2 in-memory database; data resets when the application restarts.

## Author
Subhash Chandra Bose
