## Demo Spring Boot Application with OutOfMemoryError Simulation

This repository contains a demo Spring Boot application designed to trigger an OutOfMemoryError and generate a heap dump for analysis. The heap dump can be analyzed using Eclipse Memory Analyzer Tool (MAT).

### Prerequisites

- Docker
- Docker Compose
- Java 17 (for local builds and running the application)
- IntelliJ IDEA

### Getting Started
```
mvn package
docker compose up -d
```

#### Trigger OutOfMemoryError
Open your browser and navigate to `http://localhost:8080/oom`. This will trigger an OutOfMemoryError and generate a heap dump in the /dumps directory inside the container.

#### Analyze via Profiler
![Alt text](screenshots/heap-dump-profiler.png?raw=true "Analyzer via Intellij")