# intergrating_nginx_spring_mysql-demo
### Languages
[![Java](https://img.shields.io/badge/Java-black?style=for-the-badge&logo=java)](https://github.com/parkgeounyoung/intergrating_nginx_spring_mysql-demo)
[![SQL](https://img.shields.io/badge/SQL-black?style=for-the-badge&logo=sql)](https://github.com/parkgeounyoung/intergrating_nginx_spring_mysql-demo)

### Technologies & Frameworks
[![Spring](https://img.shields.io/badge/spring-black?style=for-the-badge&logo=spring)](https://spring.io/)
[![Spring Boot](https://img.shields.io/badge/springboot-black?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-black?style=for-the-badge&logo=MySQL)](https://www.mysql.com/)
[![Insomnia](https://img.shields.io/badge/insomnia-black?style=for-the-badge&logo=insomnia)](https://insomnia.rest/)

### Projecct Description
For Spring's understanding, 
1. create REST API
2. create CRUD
3. connect between Spring, MySql 
4. connect between Spring, nodejs
5. check REST API by [Insomnia](https://www.google.com/search?q=Insomnia&ei=x4dnZPOcBoOAoATR1p3gAw&ved=0ahUKEwiznLf8y4H_AhUDAIgKHVFrBzwQ4dUDCA8&uact=5&oq=Insomnia&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzILCAAQgAQQsQMQgwEyBQgAEIAEMgUIABCABDIFCC4QgAQyBQgAEIAEMgUIABCABDILCC4QgAQQxwEQ0QMyBQgAEIAEMggILhCABBDUAjIFCAAQgAQ6BAgAEEdKBAhBGABQtgJYtgJglgZoAHADeACAAXaIAXaSAQMwLjGYAQCgAQKgAQHIAQrAAQE&sclient=gws-wiz-serp) < finish
6. change cdo recive to JSON
7. make login page

### Folder, File Description
[porm.xml](https://github.com/parkgeounyoung/intergrating_nginx_spring_mysql-demo/blob/main/pom.xml) : A dependency is write to define the modules required

[application.yml](https://github.com/parkgeounyoung/intergrating_nginx_spring_mysql-demo/blob/main/src/main/resources/application.yml) : Set up spring server  and  connect of the DBMS

[ServerApp.java](https://github.com/parkgeounyoung/intergrating_nginx_spring_mysql-demo/blob/main/src/main/java/student/ServerApp.java) : Server entry point

[object](https://github.com/parkgeounyoung/intergrating_nginx_spring_mysql-demo/tree/main/src/main/java/student/object) : Object class is defined
- Student.java : domain(basic), Default Object Class
- StudentCdo.java : The parts that are needed to communicate client, Use to receive values from RestAPI
- StudentJpo.java : The parts that are needed to communicate DBMS, Use to receive values from DBMS

[controller](https://github.com/parkgeounyoung/intergrating_nginx_spring_mysql-demo/tree/main/src/main/java/student/controller) : REST API is defined
- StudentController.java : REST API is defined, connect Service

[Service](https://github.com/parkgeounyoung/intergrating_nginx_spring_mysql-demo/tree/main/src/main/java/student/Service) : connect between controller and Store
- StudentServicelmpl.java : Interface for connect between StudentController
- logic 
- - StudentService.java : connect Store

[Store](https://github.com/parkgeounyoung/intergrating_nginx_spring_mysql-demo/tree/main/src/main/java/student/Store) : connect between Store and MySQL,  CRUD is defined
- StudentStoreLmpl.java: Interface for connect between StudentService
- logic
- - StudentStore.java : connect DBMS

          
