FROM openjdk:8-jdk-alpine

ADD ./target/helloworld-0.0.1-SNAPSHOT.jar helloworld-0.0.1-SNAPSHOT.jar
COPY ./logs/* logs.log

RUN mkdir -pv log4j2/lib


EXPOSE 8080

CMD java -jar helloworld-0.0.1-SNAPSHOT.jar
