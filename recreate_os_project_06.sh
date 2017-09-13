#!/usr/bin/env bash

set -e

cat web-ui/Dockerfile | sed 's/target\/app\.jar/app\.jar/g' | oc new-build --name admin-ui -D -

oc start-build admin-ui --from-file admin-ui/target/app.jar

oc new-app web-ui/admin-ui

oc expose dc admin-ui --port 8080

oc expose service admin-ui

mvn clean install
oc start-build web-ui --from-file web-ui/target/app.jar
oc start-build hello-service --from-file hello-service/target/app.jar
