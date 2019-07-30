# Base docker image with aws-cli installed
FROM 585307327397.dkr.ecr.ca-central-1.amazonaws.com/q-deployment-support/awscli:1.0

# Expose this volume for qscoring app
VOLUME  /var/qscoring/products
WORKDIR /var/qscoring/products

# Download from s3 directory based on the environment
ENTRYPOINT aws s3 cp s3://qglobal/qscoring/products/${APPLICATION_ENVIRONMENT} . --recursive