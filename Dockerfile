FROM eclipse-temurin:21-jdk-alpine
ENV PORT=5467
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE ${PORT}
ENTRYPOINT ["java", "-jar", "app.jar"]
