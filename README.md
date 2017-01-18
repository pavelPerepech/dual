# dual
Sample WEB-application: can start standalone and on tomcat

## Build ##
Standart ant build with Ivy Extension.
Install Apache Ant: http://ant.apache.org/ and Apache Ivy http://ant.apache.org/ivy/

## Run ##
### Development mode from IDE ###
Start class DevLauncher, Start Web Browser url: http://localhost:18080 or http://localhost:18080/api/dummy

### Run Standalone ###
java -jar dual.war, Start Web Browser url: http://localhost:8080 or http://localhost:8080/api/dummy

### Run in Tomcat ###
Deploy application to Tomcat (copy dual.war into webapps subfolder of tomcat) , Start Web Browser url: http://localhost:8080/dual or http://localhost:8080/dual/api/dummy
