FROM maven:3.6.3-openjdk-17-slim as build

COPY . .

RUN mvn clean package

FROM openjdk:17-jdk-alpine
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]