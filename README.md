#Portfolio Web App (backend)
This project has use follows technologies:
- Spring boot 2.6.4
- Spring Data JPA
- Twitter4j core 4.0.4
- Lombok 1.18.22
- Remote Database Mysql 5.6
- Junit 4.8.1

####Endpoints:

Get person portfolio list in remote Mysql DB:
http://localhost:8080/demo/portfolio

Get time line of an user of Twitter using Twitter4j:
http://localhost:8080/demo/get-timeline

Edit user profile (@PutMapping):
http://localhost:8080/demo/{idporfolio}

##To run this project you should follow next steps:

1. Clone repository:
> git clone https://github.com/mallquilm2/backend-porfolio.git

2. Execute maven commands to clean and build:
> mvn clean install

3. In Spring boot, run aplication:
> Right Click on project -> Run As -> Spring Boot App

4. Thanks for visit my repo :)
