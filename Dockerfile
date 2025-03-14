# Use an official OpenJDK runtime as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy all Java files into the container
COPY Flight-Management-System/*.java /app/

# Compile all Java files
RUN javac App.java

# Run the main Java application
CMD ["java", "App"]
