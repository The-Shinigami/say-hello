RUN apt install maven



CMD python /app/app.py

FROM openjdk:8-jdk-alpine3.7 AS builder
FROM openjdk:8-jre-alpine3.7

RUN java -version

COPY ../target/say-hello-0.0.1.jar /

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "say-hello-0.0.1.jar"]