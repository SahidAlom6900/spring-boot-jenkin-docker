FROM openjdk:8
EXPOSE 9090
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-jenkin-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkin-docker-0.0.1-SNAPSHOT.jar"]