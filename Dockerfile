FROM openjdk:8
ADD target/docker-bikeapi.jar docker-bikeapi.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "docker-bikeapi.jar"]