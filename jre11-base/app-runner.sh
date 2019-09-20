#!/bin/sh

# Print the environment
# APPLICATION_ENVIRONMENT is set via fargate
echo ------------------------------
echo Application Environment : $APPLICATION_ENVIRONMENT
echo Context Root            : $CONTEXT_ROOT
echo ------------------------------

# create app properties
touch app.properties

# Get the db secrets & store in app.properties
cat /var/app/secrets/* >> app.properties 2> /dev/null

# Start the spring boot app with embedded tomcat
java -jar app.jar \
          --spring.profiles.active=$APPLICATION_ENVIRONMENT \
          --server.servlet.context-path=$CONTEXT_ROOT \
          --server.port=8080 \
          --security.oauth2.resource.public-key=/var/app/identity/public-key.txt \
          --management.endpoints.web.base-path=/monitor \
		  --management.endpoints.web.path-mapping.health=health \
		  --spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true \
          --spring.config.additional-location=./app.properties