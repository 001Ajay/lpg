# LPG-SERVICE
Back-end service for LPG app

Server Port: 8080

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