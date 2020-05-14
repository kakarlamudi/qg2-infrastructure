# Base docker image with aws-cli installed
FROM 585307327397.dkr.ecr.ca-central-1.amazonaws.com/q-deployment-support/awscli:1.0

# Expose this volume for slang reporting service
VOLUME  /var/reporting/bundles
WORKDIR /var/reporting/bundles

# Download from s3 directory based on the environment
ENTRYPOINT aws s3 cp s3://qglobal/reporting/products/${APPLICATION_ENVIRONMENT} . --recursive