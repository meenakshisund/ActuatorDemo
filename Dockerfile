FROM openjdk:11
ADD target/actuator.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","actuator.jar"]