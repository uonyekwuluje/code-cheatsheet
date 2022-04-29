# Compile/Install
```
mvn clean install
```

# Package
```
mvn package
```

# Tests
```
# Test Environments
./mvnw spring-boot:run 
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
./mvnw spring-boot:run -Dspring-boot.run.profiles=stage
./mvnw spring-boot:run -Dspring-boot.run.profiles=prod

# Testing with jar
java -jar target/app-0.0.1-SNAPSHOT.jar
java -Dspring.profiles.active=dev -jar target/app-0.0.1-SNAPSHOT.jar
java -Dspring.profiles.active=stage -jar target/app-0.0.1-SNAPSHOT.jar
java -Dspring.profiles.active=prod -jar target/app-0.0.1-SNAPSHOT.jar
```


# URL Test
```
curl -s http://localhost:8080/info | jq .
```

# Resources
* https://www.baeldung.com/spring-profiles
