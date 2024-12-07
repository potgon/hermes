# Use an OpenJDK base image
FROM amazoncorretto:21.0.5

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR into the container
COPY target/hermes-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
