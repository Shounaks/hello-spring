# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim
LABEL author = "Shounak Bhalerao"

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/hello-spring-0.0.1-SNAPSHOT.jar /app/myapp.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]