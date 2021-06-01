# LPG-SERVICE
Back-end service for LPG app

Server Port: 8080

To start application - 
Run the java class LpgServiceApplication
```
src/main/java/com/demo/lpgservice/LpgServiceApplication.java
``` 

## H2 (in memory db)
- DB Console : http://localhost:8080/h2-console/
- Username : sa
- Password : password
- JDBC url : jdbc:h2:mem:lpg-db
- DDL file : schema.sql
- DML file : data.sql

## APIs
### Get all Products api
[GET] http://localhost:8080/products/

Sample response structure -

```
[
  {
    "id": 1,
    "name": "Knife Set",
    "description": "A set of knives in all shapes and sizes.",
    "category": {
      "id": 1,
      "name": "Kitchen"
    },
    "creation_date": "2020-09-20 0:01",
    "update_date": "2020-09-20 0:01",
    "last_purchased": "2020-10-24 0:01"
  },
  {
    "id": 2,
    "name": "Plate Rack",
    "description": "A storage solution for plates.",
    "category": {
      "id": 1,
      "name": "Kitchen"
    },
    "creation_date": "2020-09-20 0:01",
    "update_date": "2020-09-20 0:01",
    "last_purchased": "2020-10-19 0:01"
  }
]
```

### Get all Categories api
[GET] http://localhost:8080/products/categories

Sample response structure -

```
[
  {
    "id": 1,
    "name": "Kitchen"
  },
  {
    "id": 2,
    "name": "Power Tools"
  },
  {
    "id": 3,
    "name": "Furniture"
  },
  {
    "id": 4,
    "name": "Electric"
  },
  {
    "id": 5,
    "name": "Washroom"
  },
  {
    "id": 6,
    "name": "Textiles"
  },
  {
    "id": 7,
    "name": "Misc."
  }
]
```