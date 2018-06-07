FROM frolvlad/alpine-oraclejdk8:slim
ADD springboot-bike-0.0.1-SNAPSHOT.jar api.jar
RUN sh -c 'touch /api.jar'
ENV JAVA_OPTS="-Dspring.profiles.active=prod"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /api.jar" ]