# Java-Restful-API-example
Creating a REST API in Java with Spring Boot and MongoDB Integration
Here we need to setup the Spring Tool suite, MongoDB for executing our task. We need to create the spring starter project and then create Server, repository, controller packages and class.
The Complete Code is given above and the output has been given below :-

1. It shows the main class of spring application 
![1](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/a4aa27da-9b6b-482b-a8b8-fccedf73f82a)

2. Then we have created the server class
![2](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/c6119870-f796-4c8b-8cc9-99ef54487a75)

3. servercontroller class
![3](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/3674e625-2fcf-4b65-9a67-dd5259cdc2f3)

4. repository class
![4](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/e98e0023-581f-4d7a-81bf-2bfbbe644362)

5. application properties or application.yaml file
![5](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/5cf2813e-aabb-4b7b-9537-3df3d6d9571e)

6. mongodb of pom.xml file and its configurations
![6](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/b85deae1-0217-4b4f-969f-2ba9b395757c)

7. we need to RUN the main class by using RUN AS -> Java Application we are able to get the sucessful spring Boot is running under the 8080 port.
![7](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/6e6f16cf-50dd-4a2d-af70-f3bddd668928)

8. Then in MongoDB we have created the database as Server and collection also an server and it has been listed down here.
![8](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/8e2628d0-04fd-456f-97b2-5e1c9f2cc11b)

9. then we have to POST the content using RESTful API on postman by using PUT commmand.
![9](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/b8bc3e2d-e414-41a4-8bd5-974acfd0a32d)

10. After the Postman API put function happened then when we refresh our mongodb we able to see the created data has been present over there.
![10](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/71340571-65a3-4da7-9a5e-3df8cec1ca3d)

11. By using GET command we able to get what are the content are available on the database can be show here.
![11](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/1adbcf8e-3b1a-4e5e-a740-b95d0586bbf6)

12. Here we are going to delete the id by using DELETE command in postman API, where as we see 678 as an ID.
![12](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/0344a676-70bd-42d1-88c8-c2a376ba7fc2)

13. By using DELETE Command we are able to delete that particular ID content on the database in it.
![13](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/37e91502-d1ed-45b2-b5a4-8b7d1fcd408b)

14. After deletion refresh your MongoDB the content has been deleted from the database in it.
![14](https://github.com/Ayyappan006/Java-Restful-API-example/assets/99162903/5816ad79-c38d-4909-95d4-2b54afa4bf6e)

