# Build stage
FROM maven:3.9.4-eclipse-temurin-17 as build
WORKDIR /workspace
COPY . /workspace
RUN mvn -B -DskipTests clean package

# Run stage
FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=target/*.jar
COPY --from=build /workspace/${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]