# Base docker image with aws-cli installed
FROM 585307327397.dkr.ecr.ca-central-1.amazonaws.com/q-deployment-support/awscli:1.0

# Expose this volume for qglobal app
RUN mkdir -p /var/app/secrets
VOLUME  /var/app/secrets

# Workspace for the script
WORKDIR /var/app
COPY get-secrets.sh get-secrets.sh

# Get the DB secrets for the given environment
ENTRYPOINT sh get-secrets.sh $APPLICATION_ENVIRONMENT