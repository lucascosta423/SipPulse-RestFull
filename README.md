# SipPulse-RestFull

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg?style=for-the-badge)
![Docker](https://img.shields.io/badge/Docker-Ready-2496ED?style=for-the-badge&logo=docker&logoColor=white)

> A RESTful API built with Java/Spring Boot to consume SipPulse SOAP services, abstracting protocol complexity and exposing modern and simple endpoints.

---

## Table of Contents

- [About](#about)
- [Prerequisites](#prerequisites)
- [Configuration](#configuration)
- [Installation](#installation)
- [Endpoints](#endpoints)
- [API Documentation (Swagger)](#api-documentation-swagger)
- [Docker](#docker)
- [Contributing](#contributing)
- [License](#license)

---

## About

**SipPulse-RestFull** is an integration layer that converts REST calls into SOAP requests, allowing modern applications to consume SipPulse legacy services in a simple and standardized way.

### Features

- Domain Management
- Profile Management
- Subscriber Management
- DID (Number) Management
- Address Management
- Module Reload

---

## Prerequisites

- Java 21+
- Maven 3.8+
- Docker (optional)

---

## Configuration

### Environment Variables

| Variable | Description | Required |
|----------|-------------|----------|
| `USER_ADMIN` | Auth user for SipPulse | Yes |
| `PASSWORD_ADMIN` | Auth password for SipPulse | Yes |
| `URL` | Base URL for SOAP services (e.g., `http://xxx.xxx.xxx.xxx:8080`) | Yes |

---

## Installation

### Running locally

```bash
# Clone the repository
git clone https://github.com/SipPulse-RestFull/sippulse-restfull.git

# Enter the directory
cd sippulse-restfull

# Set environment variables
export USER_ADMIN=your_user
export PASSWORD_ADMIN=your_password
export URL=http://xxx.xxx.xxx.xxx:8080

# Build and run
./mvnw spring-boot:run
```

### Building a JAR

```bash
# Build
./mvnw clean package -DskipTests

# Run the JAR
java -jar target/soapadapter-0.0.1-SNAPSHOT.jar
```

---

## Endpoints

The API is available at `http://localhost:8080`.

### Health Check

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/actuator/health` | Check if the application is healthy |

### Domains

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/domain` | List all domains |

### Profiles

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/profile/{domain}` | List profiles by domain |

### Subscribers

| Method | Endpoint                           | Description              |
|--------|------------------------------------|--------------------------|
| POST | `/subscriber`                      | Create a new subscriber  |
| POST | `/subscriber/credit`               | Add credit in subscriber |
| PATCH | `/subscriber/{accountcode}/active` | Activate a subscriber    |
| PATCH | `/subscriber/{accountcode}/block`  | Block a subscriber       |

### DIDs (Numbers)

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/dids/available?domain={domain}` | List available numbers |
| GET | `/dids?accountcode={accountcode}` | List DIDs by account |
| POST | `/dids` | Register a new DID |
| DELETE | `/dids/{id}` | Remove a DID |

### Addresses

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/address/{accountcode}` | List addresses by account |
| POST | `/address` | Add an address |
| PATCH | `/address` | Update an address |
| DELETE | `/address/{domain}/{id}` | Remove an address |

### Module Reload

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/reload/profile?profile={profile}&domain={domain}` | Reload profile |
| POST | `/reload/subscriber/{accountcode}` | Reload subscriber |
| POST | `/reload/did/{didId}` | Reload DID |
| POST | `/reload/address` | Reload addresses |
| POST | `/reload/huntgroup/{huntGroupId}` | Reload hunt group |

---

## API Documentation (Swagger)

Interactive API documentation is available at:

```
http://localhost:8080/swagger-ui.html
```

OpenAPI specification is available at:
```
http://localhost:8080/v3/api-docs
```

---

## Docker

### Build image

```bash
docker build -t sippulse-rest-api:latest .
```

### Run container

```bash
docker run -d \
  --name sippulse-rest-api \
  -p 8080:8080 \
  -e USER_ADMIN=your_user \
  -e PASSWORD_ADMIN=your_password \
  -e URL=http://xxx.xxx.xxx.xxx:8080 \
  sippulse-rest-api:latest
```

### Docker Compose

```yaml
version: '3.8'

services:
  sippulse-rest-api:
    image: sippulse-rest-api:latest
    ports:
      - "8080:8080"
    environment:
      - USER_ADMIN=your_user
      - PASSWORD_ADMIN=your_password
      - URL=http://xxx.xxx.xxx.xxx:8080
    restart: unless-stopped
```

### Pull from Docker Hub

```bash
docker pull <seu-usuario>/sippulse-rest-api:latest
```

> Substitua `<seu-usuario>` pelo seu username do Docker Hub (definido em `DOCKERHUB_USERNAME` no CI/CD).

---

## CI/CD

The project has automated pipelines that:

**On tags (`v*`, e.g., `v1.0.0`):**
- Build with Maven
- Run tests
- Generate multi-arch Docker image (amd64/arm64)
- Publish to Docker Hub as `<seu-usuario>/sippulse-rest-api`

**Tags pushed:**
| Git Tag | Docker Tags |
|---------|-------------|
| `v1.0.0` | `1.0.0`, `latest` |
| `v1.0.0-beta` | `1.0.0-beta`, `beta` |
| `v1.0.0-rc` | `1.0.0-rc`, `rc` |

```bash
git tag v1.0.0
git push origin v1.0.0
```

**On push/pull request to `main` or `develop`:**
- Build and run tests to ensure code quality

---

## Contributing

Contributions are very welcome! Read [CONTRIBUTING.md](CONTRIBUTING.md) to learn how to participate in the project.

For issues and feature requests, check existing issues before opening a new one.

---

## License

This project is licensed under the **GNU General Public License v3.0**.
See the [LICENSE](LICENSE) file for more details.

```
SipPulse-RestFull  Copyright (C) 2026
This program comes with ABSOLUTELY NO WARRANTY.
This is free software, and you are welcome to redistribute it
under certain conditions; see LICENSE for details.
```
