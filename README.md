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





# Spring boot project from scratch

## spring Initialiser

###  log on to :  start.spring.io

project => maven
lang => java
Spring Boot => 3.0.0

Project Matadata

    group :         com.resafe.springboot           (class name)
    Atrifact :      learn-spring-boot               (package name)
    Name :          learn-spring-boot               (default)
    Description :   Demo project for Spring Boot    (default)
    Package name :  keep default                    (default)   



    dependencies : Spring Web      
     







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
	
##### @ConfigurationProperties
	complex configuration(further explained below)


### Profiles
> Helps in creating different configurations in different Environments.  

	Let's say we want to profile our project on the basis of the info we want to display on the console. 

1. dev
2. QA
3. stage
4. prod  
etc

> for different profile we need to add respective **application.properties**  *"src/main/resources"*
	
**e.g. :**  application**-dev**.properties, application**-prod**.properties, etc  
	

By default : project doesn't use any profile until we include it in **application.properties**   

We can use *spring.profiles.active=_____* to set the profile active in the "application.properties" file.

#### Logging levels  

1. trace
2. debug
3. info
4. warning
5. error
6. off
  
  

### ConfigurationProperties
	Helps in setup complex configuration for environment in the app.  
	
e.g. : Let's say I've to config. **currency service** for my app.
> Configurations to be defined in **application.properties**. 
	**prefix** parameter to be passed in annotation @ConfigurationProperties. Which is written in CurrencyServiceConfiguration.java
	
	to test the configuration are correctly mapped or not.
we can use a simple controller. named CurrencyConfigurationController.java is created.








### Embedded Server

Step 1 : Install Java  
Step 2 : Run **JAR** file

	To get the JAR file do the following steps.

> on the main project file, right-click (options) > Run as (maven build). 
 
	(Inside the prompt) Goals > "clean install" > Run...  
	
	This will run. Later, at the end > "C:\Users\risha\.m2\repository\com\risafe\springboot\learn-spring-boot\0.0.1-SNAPSHOT\learn-spring-boot-0.0.1-SNAPSHOT.jar"
	
In console > go to the path.  
	`$java -jar learn-spring-boot-0.0.1-SNAPSHOT.jar` (enter)
		
	


### S B Actuator (Monitoring)









