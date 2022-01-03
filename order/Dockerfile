FROM openjdk:11.0.10-jre-slim-buster
ARG JAR_FILE=build/libs/*.jar
ADD ${JAR_FILE} order-1.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","order-1.jar"]
