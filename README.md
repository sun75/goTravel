# goTravel
# TravelGo - Simplified Transportation Booking Platform

A Spring Boot-based backend for a multi-modal transportation booking system.

## 🛠️ Tech Stack
- **Backend**: Java 11, Spring Boot, Spring Data JPA
- **Database**: MySQL, Redis (Caching)
- **DevOps**: Docker, Docker Compose
- **API Docs**: Swagger UI

## 🚀 Quick Start

### 1. Prerequisites
- Docker & Docker Compose
- JDK 11

### 2. Run the System
```bash
# 启动MySQL和Redis
docker-compose up -d

# 构建并运行Spring Boot应用
mvn clean package
java -jar target/travelgo-0.0.1-SNAPSHOT.jar
