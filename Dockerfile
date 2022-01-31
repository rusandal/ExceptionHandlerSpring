FROM adoptopenjdk/openjdk11:jre-11.0.13_8-alpine
EXPOSE 8080
COPY target/AuthorizationControllerSpringBoot-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "/app.jar"]
