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

>How to run tests

test file location : src/test/java/com/example/feedback/service/FeedbackServiceTest.java
run command : mvn test
