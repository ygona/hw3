FROM openjdk:19
COPY target/Surveyjar.jar Surveyjar.jar
ENTRYPOINT ["java", "-jar", "/Surveyjar.jar"]
EXPOSE 8080