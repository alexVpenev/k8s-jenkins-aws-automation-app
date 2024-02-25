FROM openjdk:21

WORKDIR /app

COPY target/k8s-jenkins-aws-automation-app-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8080

ENV DB_NAME=${DB_NAME}
ENV DB_HOST=${DB_HOST}
ENV DB_PORT=${DB_PORT}
ENV DB_USERNAME=${DB_USERNAME}
ENV DB_PASSWORD=${DB_PASSWORD}

CMD ["java", "-jar", "k8s-jenkins-aws-automation-app-0.0.1-SNAPSHOT.jar"]