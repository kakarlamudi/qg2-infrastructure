#!/bin/sh

# Access secrets
echo Accessing S3 for secrets for $1
aws s3 cp s3://qglobal/flyway/$1/ 		/var/app/secrets/ --recursive


# Access DB scripts
echo Accessing s3 for DB Scripts. Commit hash: $2
aws s3 cp s3://qglobal/flyway/dbscripts/$2/dist.tar.gz /db/migration/
cd /db/migration
tar zxvf  dist.tar.gz
rm  dist.tar.gz

echo done