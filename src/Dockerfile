FROM openjdk:8-jdk-alpine3.7 AS builder
FROM openjdk:8-jre-alpine3.7

COPY ../target/say-hello-0.0.1.jar /

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "say-hello-0.0.1.jar"]