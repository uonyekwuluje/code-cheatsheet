# CRUD API for Employee Application
This small application is geared at testing and exploring CRUD concepts using Springboot.

## Requirements
* Docker
* Docker Compose
* Kubernetes
* Postgres

## Build Operations & Tasks 
Build and run
```
mvn clean install
```


## Test Application
```
./mvnw spring-boot:run
curl -s 'localhost:8080/baseuser?userid=stud12&firstName=Tony&lastName=Parker' | jq 
```
