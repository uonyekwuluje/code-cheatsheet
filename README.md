# Coding Cheat Sheet
Coding cheat sheet
* [Spring](https://spring.io/)
* [Spring Quick Start](https://start.spring.io/) 

## Build Image 
```
docker-compose -f devenv-compose.yml build buildevenv
```

## Start, connect and test image 
```
docker run -ti dev-environment bash
```

## Run Image Directly
```
docker-compose -f devenv-compose.yml run buildevenv bash
```
