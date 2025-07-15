FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app
COPY . .

# Даем права на выполнение mvnw перед использованием
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# --- Запуск jar ---
FROM eclipse-temurin:17-jre
WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]