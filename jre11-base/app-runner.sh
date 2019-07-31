#!/bin/sh

# Print the environment
# APPLICATION_ENVIRONMENT is set via fargate
echo ------------------------------
echo Application Environment : $APPLICATION_ENVIRONMENT
echo ------------------------------

# create app properties
touch app.properties

# Get the db secrets & store in app.properties
cat /var/app/secrets/* >> app.properties 2> /dev/null

# Start the spring boot app with embedded tomcat
java -jar app.jar \
          --spring.profiles.active=$APPLICATION_ENVIRONMENT \
          --spring.config.additional-location=./app.properties