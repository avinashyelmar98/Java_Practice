# Start with a base image containing Java 21 runtime
FROM eclipse-temurin:21-jdk-alpine

MAINTAINER eazybytes.com

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]
