# Use openjdk - JRE
FROM openjdk:11.0-jre-slim

# Create a workspace for the app
WORKDIR /usr/pearson/qglobal

# Expose app port
EXPOSE 8080

# Copy the runner
COPY app-runner.sh app-runner.sh

# Start the app
ENTRYPOINT sh app-runner.sh