# Stage 1: Build
FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run (Lightweight)
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

# Security: create non-root user
RUN useradd -m appuser
USER appuser

COPY --from=builder /build/target/*.jar app.jar

EXPOSE 3000

ENTRYPOINT ["java","-jar","app.jar", "--server.port=3000"]