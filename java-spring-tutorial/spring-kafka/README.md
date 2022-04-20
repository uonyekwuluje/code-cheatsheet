# Compile Test 
```
mvn clean package
```

# Test App
```
./mvnw spring-boot:run
```
Test with POST with payload
```
curl -X POST http://localhost:8080/api/v1/messages \
-H 'Content-Type: application/json' \
-d '{"message":"CML Kafka Test"}'
```

# Reference
* [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
