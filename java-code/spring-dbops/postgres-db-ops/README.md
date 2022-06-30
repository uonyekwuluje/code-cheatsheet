# Spring boot Postgres Operations

## Create Database
```
CREATE ROLE studadmin;
ALTER USER studadmin WITH PASSWORD 'password123';
ALTER USER studadmin WITH SUPERUSER;
ALTER ROLE studadmin WITH LOGIN;
CREATE DATABASE studentdb;
GRANT ALL PRIVILEGES ON DATABASE studentdb TO studadmin;
```

## CRUD Task
```
# ----------------------------- #
#    List Students              #
# ----------------------------- #
curl -s localhost:8080/api/v1/list | jq .

# ----------------------------- #
#    Add Students               #
# ----------------------------- #
curl -d "@data.json" \
-H 'Content-Type: application/json' \
-X POST  http://localhost:8080/api/v1/add
>>
{
  "studentRegNum": "stud-rec-001",
  "studentFirstName": "Tony",
  "studentLastName": "Stark",
  "studentGrade": 34.56
}

# ---------------------------- #
# Update Student               #
# ---------------------------- #
curl -d "@data-update.json" \
-H 'Content-Type: application/json' \
-X PUT  http://localhost:8080/api/v1/update
>>
{
  "id": 3,
  "studentRegNum": "stud-rec-003",
  "studentFirstName": "Benedict",
  "studentLastName": "Cumberbatch",
  "studentGrade": 55.70
}

# ---------------------------- #
# Delete Specific Students     #
# ---------------------------- #
curl -X DELETE -s localhost:8080/api/v1/delete/5 | jq .
```
