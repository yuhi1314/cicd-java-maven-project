FROM openjdk:8-jdk-alpine

ADD ./target/helloworld-0.0.1-SNAPSHOT.jar helloworld-0.0.1-SNAPSHOT.jar
ADD ./logs/* logs.log

EXPOSE 8080

CMD java -jar helloworld-0.0.1-SNAPSHOT.jar


