
FROM maven:3.5-jdk-8

RUN usermod -a -G staff jenkins

VOLUME ["/deploy/application"]

WORKDIR /deploy/application

ADD . .

ENTRYPOINT ["mvn","clean","package"]

USER jenkins
