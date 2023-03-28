

# Project Title
SOAP Sakila Database Web Service

### Description
- This API allow user to access and retrieve data from many categories such as actor,film and others
it build recently using Soap

# Database
- Execute the sakila-schema.sql script to create the database structure
- execute the sakila-data.sql script to populate the database structure, by using the following commands:
- change .txt to .sql
- mysql> SOURCE C:/temp/sakila-db/sakila-schema.sql;
- mysql> SOURCE C:/temp/sakila-db/sakila-data.sql;
- [sakila-data.txt](https://github.com/aahmedYassin/sakila-db/files/11092381/sakila-data.txt)
- [sakila-schema.txt](https://github.com/aahmedYassin/sakila-db/files/11092382/sakila-schema.txt)
##  Technologies

- Maven
- Tomcat(apache-maven-3.8.6)
- JAX-WS Metro
- SoapUi(https://www.soapui.org/downloads/soapui/)


## Run with Maven

- pom.xml.
Change the configuration of Tomcat 
     http://localhost:port/manager/text

- cmd
mvn clean compile tomcat7:redeploy



