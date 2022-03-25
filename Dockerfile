FROM openjdk:8
EXPOSE 9090
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-jenkin-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkin-docker.jar"]