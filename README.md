📚 Student Service

student-service is a Spring Boot microservice that manages student-related data and operations.
It is built using Java, Spring Boot, and Maven, and is designed to run as a containerized service in cloud environments.

🚀 Features

CRUD operations for Student entities

RESTful APIs

Spring Boot & Spring MVC

Maven-based build

Health check endpoint

Dockerized application

CI/CD ready (Azure Pipelines)

🛠️ Tech Stack

Java 17

Spring Boot

Maven

REST APIs

Docker

Azure DevOps Pipelines

Azure Container Registry (ACR)

📁 Project Structure
student-service
├── src
│   ├── main
│   │   ├── java/com/example/student
│   │   └── resources
│   │       └── application.yml
│   └── test
├── Dockerfile
├── pom.xml
├── azure-pipelines.yml
└── README.md

▶️ Running the Application Locally
1️⃣ Prerequisites

Java 17+

Maven 3.8+

Docker (optional)

2️⃣ Build the Project
mvn clean package

3️⃣ Run the Application
java -jar target/student-service-*.jar


Application will start on:

http://localhost:8080

🔍 Health Check
GET /actuator/health


Response:

{
"status": "UP"
}

📡 Sample API Endpoints
Method	Endpoint	Description
GET	/students	Get all students
GET	/students/{id}	Get student by ID
POST	/students	Create student
PUT	/students/{id}	Update student
DELETE	/students/{id}	Delete student
🐳 Docker Support
Build Docker Image
docker build -t student-service .

Run Container
docker run -p 8080:8080 student-service

🔄 CI/CD Pipeline

This project includes an Azure Pipelines YAML that:

Builds the application

Runs unit tests

Packages the JAR

Builds Docker image

Pushes image to Azure Container Registry

🔐 Configuration

Configuration is managed via:

application.yml

Environment variables (recommended for production)

Example:

server:
port: 8080

🧪 Testing

Run unit tests:

mvn test

🌍 Deployment

The service can be deployed to:

Azure App Service

Azure Kubernetes Service (AKS)

Docker / VM environments

👨‍💻 Maintainer

Service Name: student-service

Owner: DevOps / Platform Team

📄 License

This project is licensed under the MIT License.