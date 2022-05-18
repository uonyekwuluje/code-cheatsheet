FROM maven:3.8-openjdk-17

RUN mkdir -p /app/
ADD target/prdt-*.jar /app/prdt-api.jar

CMD java -jar /app/prdt-api.jar
