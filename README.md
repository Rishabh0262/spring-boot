# Spring Boot
Helps you build PRODUCTION-READY apps QUICKLY.  
	* Build QUICKLY  
		- **Spring initializr**  
		- **Spring boot Starter Projects** : helps quickly define dependency for the project  
		- **Spring Boot Auto Configuration** : helps find the configuration based on the dependencies in the class path  
		- **Spring Boot DevTools** : application changes w/o manually restart server.  
	* Be PRODUCTION-READY
		- Logging
		- different Configuration for Different Environments
			- Profiles, ConfigurationProperties
		- Monitoring (spring boot actuator)


### Spring Boot Starter Projects  

**Starters** :  *dependency descriptor* for diff. features.  
	*e.g.* : to build a **web app** or **REST API**. Starter dependencies are already present in the **pom.xml**.
	
	- Web App & REST API : SB starter web (spring-webmvc, spring-web, spring-boot-starter-tomcat, spring-boot-starter-json)
	- Unit Tests - Spring Boot starter test
	- Talk to DB using JPA/JDBC - Spring boot starter data JPA/JDBC.













#### S B Devtools 
	dependency to be added in 'pom.xml'. So that we don't have to restart the server everytime we made a change in any of the files (except pom.xml)



##### LearnSpringBootApplication.java
	is the main file which is going to "Run as"  'Java Application'.
		

##### CourseController.java
	is the controller file, which contains the API data for the REST-API.



##### '@' for annotations

##### @RestController
	is used for building REST-API.	

##### @RequestMapping
	is used for URL end-points... like (/courses, /login, /register, etc, etc)











