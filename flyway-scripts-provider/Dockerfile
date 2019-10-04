# Base docker image with aws-cli installed
FROM 585307327397.dkr.ecr.ca-central-1.amazonaws.com/q-deployment-support/awscli:1.0

# Expose this volume for qglobal app
RUN mkdir -p /var/app/secrets
RUN mkdir -p /db/migration
VOLUME  /var/app/secrets
VOLUME  /db/migration

# Workspace for the script
WORKDIR /var/app
COPY get-db-scripts.sh get-db-scripts.sh

# Get the DB secrets for the given environment
ENTRYPOINT sh get-db-scripts.sh $APPLICATION_ENVIRONMENT $DB_SCRIPT_VERSION