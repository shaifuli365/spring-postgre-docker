# For Java 11
FROM openjdk:11
LABEL maintainer="shaiful"

ADD target/spring-postgre-docker.jar spring-postgre-docker.jar
ENTRYPOINT ["java","-jar","spring-postgre-docker.jar"]



# docker build -t shaiful365/spring-postgre-docker .
