FROM openjdk:21

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file into the container at /app
COPY target/k8s-jenkins-aws-automation-app-0.0.1-SNAPSHOT.jar /app/

# Expose the port that the application will run on
EXPOSE 8081

# Specify the command to run on container start
CMD ["java", "-jar", "k8s-jenkins-aws-automation-app-0.0.1-SNAPSHOT.jar"]