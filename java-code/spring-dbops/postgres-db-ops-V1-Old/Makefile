clean:
	./mvnw clean
build:
	./mvnw clean package -Dmaven.test.skip
package: build
	echo Building New Tag => $(DTAG)
	docker login 192.168.1.74 -u admin -p password
	docker build -t prdt-api:$(DTAG) .
	docker tag prdt-api:$(DTAG) 192.168.1.74/prdt-api:$(DTAG)
	docker push 192.168.1.74/prdt-api:$(DTAG)
