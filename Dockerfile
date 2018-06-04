FROM openjdk:8
ADD target/docker-bikeapi.jar docker-bikeapi.jar
EXPOSE 8085