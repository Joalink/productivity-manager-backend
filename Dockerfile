# Use Maven to build the application
FROM maven:3.9.8-eclipse-temurin-21 AS build

# Set the working directory for the build
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Use a minimal Java runtime for the final image
FROM openjdk:21-jdk-slim

# Add a volume to hold the application data
VOLUME /tmp

# the application's jar file
ARG JAR_FILE=target/ProductivityManager-0.0.1-SNAPSHOT.jar

# copy the jar file from the build stage to the final image
COPY --from=build /app/${JAR_FILE} app.jar

# the application's jat file
ENTRYPOINT ["java","-jar","/app.jar"]