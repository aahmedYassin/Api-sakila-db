

# SOAP Sakila Database Web Service

### Description
- This API allow  to access and retrieve data from many categories such as actor,film and others
it build recently using Soap

### Documentation 
- https://documenter.getpostman.com/view/14564420/2s93XyThpa

# Database
- mysql> SOURCE C:/temp/sakila-db/sakila-schema.sql;
- mysql> SOURCE C:/temp/sakila-db/sakila-data.sql;

##  Technologies
- ORM
- Maven
- Tomcat(apache-maven-3.8.6)
- JAX-WS Metro
- SoapUi(https://www.soapui.org/downloads/soapui/)

##  EndPoints
 - actor
 - film
 - category
 - address
 - city
 - country
 - staff
 - customer
 - store

## Run with Maven

- pom.xml.
Change the configuration of Tomcat 
     http://localhost:port/manager/text

- cmd 
mvn clean compile tomcat7:redeploy





