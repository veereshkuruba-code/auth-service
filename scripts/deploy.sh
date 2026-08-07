#!/bin/bash

echo "Starting deployment..."

sudo systemctl stop auth-service

sudo cp target/auth-service-0.0.1-SNAPSHOT.jar \
/opt/company-platform/auth-service/auth-service.jar

sudo systemctl start auth-service

echo "Checking health..."

curl http://localhost/actuator/health

echo "Deployment completed."

