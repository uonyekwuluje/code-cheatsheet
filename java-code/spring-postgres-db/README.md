# Springboot Postgres DB CRUD Operation

## Create Postgres DB & User
```
CREATE DATABASE products_db;
CREATE USER prdadmin WITH ENCRYPTED PASSWORD 'rm4Fw7Bi1wIks0';
GRANT ALL PRIVILEGES ON DATABASE products_db TO prdadmin;
```
Test DB Connection
```
export PGPASSWORD="rm4Fw7Bi1wIks0"
psql -U prdadmin -h 192.168.1.218 -p 5432 -d products_db
```
Create Table
```
# Connect
postgres=# \c products_db;

# Create Table
CREATE TABLE products_table(
   products_id            INT PRIMARY KEY     NOT NULL,
   products_name          CHAR(25) NOT NULL,
   products_description   CHAR(25) NOT NULL,
   products_quantity      INT     NOT NULL
);
```

## Create Application Folder
Create application folders after unzipping contents
```
mkdir src/main/java/com/inventory/prdt/{controller,model,repository}
```



## Test Application
Compile & Clean
```
./mvnw install clean
```
Execute Application
```
./mvnw spring-boot:run
```
Hello World Test
```
curl http://localhost:8080/hello
```
Test Arguments
```
curl http://localhost:8080/hello?name=Peter
```
Get Products
```
curl http://localhost:8080/api/v1/products
```
Get Specific Product
```
curl http://localhost:8080/api/v1/product/1
```
Delete Product
```
curl -X DELETE http://localhost:8080/api/v1/product/1
```
Add Products
```
curl -d "@data.json" \
-H 'Content-Type: application/json' \
-X POST  http://localhost:8080/api/v1/product
>>
{
  "productName": "Honda Accord",
  "productDescription": "Mid Size Honda Sedan",
  "productQuantity": 30
}
```

Update Products
```
curl -d "@data.json" \
-H 'Content-Type: application/json' \
-X PUT  http://localhost:8080/api/v1/product/1
>>
{
  "productName": "Honda Accord LX",
  "productDescription": "Mid Size Honda Sedan Prime",
  "productQuantity": 30
}
```


## Build Image
Run command below to create docker image
```
make package DTAG=v1.0.2
```
