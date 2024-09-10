# Use the official Java 11 image from the Docker library as the base image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper and pom.xml file into the container
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Install dependencies
RUN ./mvnw dependency:go-offline

# Copy the source code into the container
COPY src src

# Build the application
RUN ./mvnw package -DskipTests

# Expose the port the app runs on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/crmSample-0.0.1-SNAPSHOT.jar"]
	