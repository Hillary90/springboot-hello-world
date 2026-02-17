# Spring Boot REST API - Beginner's Toolkit

A simple REST API built with Spring Boot demonstrating basic endpoint creation and HTTP request handling.

## Prerequisites

- **Java JDK 17** or higher
- **Maven 3.6+**
- **Text Editor/IDE** (VS Code, IntelliJ IDEA, or Eclipse)

##  Quick Start

### 1. Clone the Repository
```bash
git clone <your-repo-url>
cd springboot-hello-world
```

### 2. Build the Project
```bash
mvn clean install
```

### 3. Run the Application
```bash
mvn spring-boot:run
```

Or run the JAR directly:
```bash
java -jar target/helloworld-1.0.0.jar
```

The application will start on **http://localhost:8080**

##  API Endpoints

| Endpoint | Method | Description | Example |
|----------|--------|-------------|---------|
| `/` | GET | Home page with endpoint list | http://localhost:8080/ |
| `/hello` | GET | Simple hello world message | http://localhost:8080/hello |
| `/greet?name=YourName` | GET | Personalized greeting with query param | http://localhost:8080/greet?name=Hillary |
| `/greet/{name}` | GET | Personalized greeting with path variable | http://localhost:8080/greet/Hillary |
| `/time` | GET | Current server time | http://localhost:8080/time |

## Testing the API

### Using Browser
Simply open your browser and visit any endpoint URL.

### Using curl
```bash
# Test home endpoint
curl http://localhost:8080/

# Test hello endpoint
curl http://localhost:8080/hello

# Test greet with query parameter
curl "http://localhost:8080/greet?name=Hillary"

# Test greet with path variable
curl http://localhost:8080/greet/Hillary

# Test time endpoint
curl http://localhost:8080/time
```

## Project Structure

```
springboot-hello-world/
├── src/main/
│   ├── java/com/moringa/helloworld/
│   │   ├── HelloWorldApplication.java      # Main application class
│   │   └── controller/
│   │       └── HelloController.java        # REST endpoints
│   └── resources/
│       └── application.properties          # Configuration
├── pom.xml                                 # Maven dependencies
└── README.md
```

##  Technologies Used

- **Spring Boot 3.2.2** - Java framework
- **Spring Web** - REST API support
- **Maven** - Build tool
- **Java 17** - Programming language

## Configuration

Default configuration in `application.properties`:
```properties
server.port=8080
spring.application.name=Spring Boot Hello World
```

To change the port, modify `server.port` value.

##  Troubleshooting

### Port 8080 already in use
```bash
# Find process using port 8080
lsof -i :8080

# Kill the process
kill -9 <PID>

# Or change port in application.properties
server.port=8081
```

### Java version mismatch
Check your Java version:
```bash
java -version
```
Update `<java.version>` in `pom.xml` to match your installed version.

##  Learn More

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Building REST APIs with Spring](https://spring.io/guides/tutorials/rest/)
- [Maven Documentation](https://maven.apache.org/guides/)

##  Author

**Hillary Tanui**  
Moringa AI Capstone Project - February 2026

##  License

This project is open source and available for educational purposes.
