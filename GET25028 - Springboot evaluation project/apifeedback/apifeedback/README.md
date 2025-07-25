>How to run the project :

1.Prerequisites : Java 17+ ,PostgreSQL , Spring boot , maven , postman

2.Create the PostgreSQL Database
  use query : CREATE DATABASE feedback_db; 

3.use command : mvn spring-boot:run

4.Bydefault the application will be running at:http://localhost:8080

>Sample API requests(postman)

1.To post feedbacks

POST http://localhost:8080/feedback \
"Content-Type: application/json" \
{
"name": "Tanish",
"email": "tanishmhatre1617@gmail.com",
"message": "Hello World"
}
<img width="1509" height="842" alt="image" src="https://github.com/user-attachments/assets/bce5973c-9606-4e34-9d95-28cf8b619d5e" />


2.To view All Feedback 

GET http://localhost:8080/feedback

{
"id": 1,
"name": "tanish",
"email": "tanishmhatre1617@gmail.com",
"message": "hello world",
"createdAt": "2025-07-24T11:10:47.061509"
},
{
"id": 2,
"name": "tanish",
"email": "tanishmhatre1617@gmail.com",
"message": "hello world",
"createdAt": "2025-07-24T11:12:11.128538"
},
{
"id": 3,
"name": "mhatre",
"email": "tanishmhatre1617@gmail.com",
"message": "hello world",
"createdAt": "2025-07-25T11:43:59.55129"
}
<img width="1552" height="910" alt="image" src="https://github.com/user-attachments/assets/007aa09c-ab7d-45ae-9863-afb3a6701366" />


>How to run tests

test file location : src/test/java/com/example/feedback/service/FeedbackServiceTest.java
run command : mvn test
<img width="1093" height="157" alt="image" src="https://github.com/user-attachments/assets/b08a69a6-6f39-4217-a3c9-1d7a7ca8b356" />

