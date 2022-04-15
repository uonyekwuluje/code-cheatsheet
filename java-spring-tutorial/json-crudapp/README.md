# Compile and run Application
Build and run
```
mvn clean install
```


## Test Application
```
./mvnw spring-boot:run
curl -s 'localhost:8080/baseuser?userid=stud12&firstName=Tony&lastName=Parker' | jq 
```
