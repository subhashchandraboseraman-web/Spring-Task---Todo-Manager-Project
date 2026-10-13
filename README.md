
cat > README.md <<'EOF'
# TaskFlow - Task Management REST API

TaskFlow is a lightweight RESTful web service built with
Java, Spring Boot, Spring Data JPA, Maven, and H2.

## Features
- Create, read, update, and delete tasks
- Update task status
- Filter tasks by status and priority
- Persist tasks using an H2 in-memory database

## Technologies
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Run the application

mvn spring-boot:run

The API runs at http://localhost:8080.

## API Endpoints

| Method | Endpoint | Description |
| POST | /api/tasks | Create a task |
| GET | /api/tasks | List all tasks |
| GET | /api/tasks/{id} | Get a task |
| PUT | /api/tasks/{id} | Update a task |
| PATCH | /api/tasks/{id}/status | Update task status |
| DELETE | /api/tasks/{id} | Delete a task |

## Database
H2 is configured as an in-memory database.
Data is reset when the application restarts.

## Author
Subhash Chandra Bose
EOF
