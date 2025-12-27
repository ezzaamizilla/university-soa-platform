# 🎓 University SOA Platform

> A comprehensive university management platform built with Service-Oriented Architecture (SOA) principles, integrating SOAP and REST services with BPMN orchestration.

[![Java](https://img.shields.io/badge/Java-11-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-12+-blue.svg)](https://www.postgresql.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## 📋 Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Features](#features)
- [Technologies](#technologies)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [BPMN Process](#bpmn-process)
- [Testing](#testing)
- [Contributors](#contributors)

## 🌟 Overview

This project implements a complete university management system using Service-Oriented Architecture (SOA). It demonstrates the integration of SOAP and REST services orchestrated through BPMN workflows to automate academic processes such as student enrollment, course management, and academic tracking.

### Key Highlights

- **6 Microservices**: 3 SOAP services + 3 REST services
- **BPMN Orchestration**: Automated enrollment workflow with Bonita Studio
- **Modern Web UI**: Responsive interface built with Spring Boot & Thymeleaf
- **Production-Ready**: PostgreSQL database with JPA/Hibernate ORM
- **Comprehensive Testing**: Unit, integration, and functional tests

## 🏗️ Architecture

```
┌─────────────────────────────────────────────────────────┐
│                    Frontend (Port 3000)                  │
│              Spring Boot + Thymeleaf + Bootstrap         │
└────────────────────┬────────────────────────────────────┘
                     │
     ┌───────────────┼───────────────┐
     │               │               │
┌────▼─────┐   ┌────▼─────┐   ┌────▼─────┐
│   SOAP   │   │   SOAP   │   │   SOAP   │
│ Services │   │ Services │   │ Services │
├──────────┤   ├──────────┤   ├──────────┤
│ Student  │   │ Teacher  │   │  Course  │
│  :8081   │   │  :8082   │   │  :8083   │
└──────────┘   └──────────┘   └──────────┘
     │               │               │
     └───────────────┼───────────────┘
                     │
     ┌───────────────┼───────────────┐
     │               │               │
┌────▼──────┐  ┌────▼──────┐  ┌────▼─────────┐
│   REST    │  │   REST    │  │     REST     │
│ Services  │  │ Services  │  │   Services   │
├───────────┤  ├───────────┤  ├──────────────┤
│Enrollment │  │Notification│ │Academic Track│
│   :8084   │  │   :8085   │  │    :8086     │
└───────────┘  └───────────┘  └──────────────┘
     │               │               │
     └───────────────┼───────────────┘
                     │
            ┌────────▼─────────┐
            │   PostgreSQL     │
            │  Database :5432  │
            └──────────────────┘
```

## ✨ Features

### SOAP Services

#### 1. Student Management Service (Port 8081)
- Create, read, update, delete student records
- Manage student profiles (name, ID, major, year)
- WSDL-compliant service definitions

#### 2. Teacher Management Service (Port 8082)
- Manage teacher profiles and specializations
- Track teacher availability
- Handle teacher-course assignments

#### 3. Course Management Service (Port 8083)
- Course catalog management
- Course creation and updates
- Credit and schedule management

### REST Services

#### 4. Enrollment Service (Port 8084)
- Student course enrollment
- View available courses
- Cancel enrollments

#### 5. Notification Service (Port 8085)
- Email/SMS notifications
- Enrollment confirmations
- Schedule change alerts

#### 6. Academic Tracking Service (Port 8086)
- Course history tracking
- Grade management
- Academic certificates generation

### BPMN Orchestration

The enrollment process is fully automated through a BPMN workflow that:
1. Verifies student identity
2. Checks course and teacher availability
3. Registers enrollment
4. Sends confirmation notification
5. Updates academic tracking

## 🛠️ Technologies

### Backend
- **Java 11**: Core programming language
- **Spring Boot 2.7**: Application framework
- **Spring WS**: SOAP web services
- **Spring Web**: REST services
- **JPA/Hibernate**: ORM for data persistence
- **PostgreSQL**: Relational database
- **Maven**: Dependency management

### Frontend
- **HTML5/CSS3/JavaScript**: Web technologies
- **Thymeleaf**: Server-side templating
- **Bootstrap**: Responsive CSS framework

### Tools & Testing
- **Eclipse IDE**: Development environment
- **Postman**: REST API testing
- **SoapUI**: SOAP service testing
- **Bonita Studio**: BPMN modeling
- **JUnit 5**: Unit testing

## 📁 Project Structure

```
university-soa-platform/
├── student-service/              # SOAP service (Port 8081)
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
├── teacher-service/              # SOAP service (Port 8082)
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
├── course-service/               # SOAP service (Port 8083)
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
├── inscription-service/          # REST service (Port 8084)
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
├── notification-service/         # REST service (Port 8085)
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
├── academic-tracking-service/    # REST service (Port 8086)
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
├── university-frontend/          # Web UI (Port 3000)
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
└── README.md
```

## 🚀 Installation

### Prerequisites

- Java JDK 11 or higher
- Maven 3.6+
- PostgreSQL 12+
- Git

### Setup Steps

1. **Clone the repository**
```bash
git clone https://github.com/yourusername/university-soa-platform.git
cd university-soa-platform
```

2. **Configure PostgreSQL**
```bash
# Create database
createdb university_soa

# Update application.properties in each service:
spring.datasource.url=jdbc:postgresql://localhost:5432/university_soa
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. **Build all services**
```bash
mvn clean install
```

4. **Start services** (in separate terminals)
```bash
# Terminal 1 - Student Service
cd student-service
mvn spring-boot:run

# Terminal 2 - Teacher Service
cd teacher-service
mvn spring-boot:run

# Terminal 3 - Course Service
cd course-service
mvn spring-boot:run

# Terminal 4 - Inscription Service
cd inscription-service
mvn spring-boot:run

# Terminal 5 - Notification Service
cd notification-service
mvn spring-boot:run

# Terminal 6 - Academic Tracking Service
cd academic-tracking-service
mvn spring-boot:run

# Terminal 7 - Frontend
cd university-frontend
mvn spring-boot:run
```

5. **Access the application**
- Frontend: http://localhost:3000
- SOAP WSDLs: 
  - http://localhost:8081/ws/students.wsdl
  - http://localhost:8082/ws/teachers.wsdl
  - http://localhost:8083/ws/courses.wsdl

## 📖 Usage

### Web Interface

1. Navigate to http://localhost:3000
2. Use the dashboard to manage students, teachers, and courses
3. Process enrollments through the automated workflow
4. View academic tracking and notifications

### API Examples

#### SOAP Request Example (Get Student)
```xml
POST http://localhost:8081/ws
Content-Type: text/xml

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:stu="http://univ.com/student">
   <soapenv:Header/>
   <soapenv:Body>
      <stu:getStudentRequest>
         <stu:studentId>12345</stu:studentId>
      </stu:getStudentRequest>
   </soapenv:Body>
</soapenv:Envelope>
```

#### REST Request Example (Get Notifications)
```bash
curl -X GET http://localhost:8085/notifications
```

## 📊 API Documentation

### SOAP Services Endpoints

| Service | Port | WSDL URL |
|---------|------|----------|
| Student Service | 8081 | http://localhost:8081/ws/students.wsdl |
| Teacher Service | 8082 | http://localhost:8082/ws/teachers.wsdl |
| Course Service | 8083 | http://localhost:8083/ws/courses.wsdl |

### REST Services Endpoints

| Service | Port | Main Endpoints |
|---------|------|----------------|
| Inscription | 8084 | GET/POST /inscriptions |
| Notification | 8085 | GET/POST /notifications |
| Academic Tracking | 8086 | GET /suivi, GET /suivi/etudiant/{id} |

## 🔄 BPMN Process

The enrollment workflow includes:

1. **Student Verification**: Validates student identity and eligibility
2. **Course Availability Check**: Verifies available seats
3. **Teacher Availability Check**: Confirms teacher assignment
4. **Decision Gateway**: Routes based on availability
5. **Enrollment Registration**: Creates enrollment record
6. **Academic Tracking Update**: Updates student records
7. **Notification**: Sends confirmation or rejection message

## 🧪 Testing

### Run Unit Tests
```bash
mvn test
```

### Run Integration Tests
```bash
mvn verify
```



## 👥 Contributors

- **EZZAAMI ZAKARIA** - Developer
- **ABOUAAM AZEDDINE** - Developer

**Supervisor**: Pr. Hatim Guermah

**Institution**: Institut National Des Postes et Télécommunications - Rabat

**Academic Year**: 2025-2026




## 📞 Contact

For questions or feedback, please contact:
- Email: zakariaezzaami337@gmail.com
- GitHub: https://github.com/ezzaamizilla

---

**⭐ If you find this project useful, please consider giving it a star!**
