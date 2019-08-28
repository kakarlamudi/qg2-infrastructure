# Use openjdk - JRE
FROM openjdk:11.0-jre-slim

# Create a workspace for the app
WORKDIR /usr/pearson/qglobal

# Expose app port
EXPOSE 8080

# Copy the runner
COPY app-runner.sh app-runner.sh

# Set env variable for auth
ENV SECURITY_JWT_KEY-STORE=/var/app/identity/public-key.txt

# Start the app
ENTRYPOINT sh app-runner.sh