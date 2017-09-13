#!/usr/bin/env bash

set -e

cat web-ui/Dockerfile | sed 's/target\/app\.jar/app\.jar/g' | oc new-build --name hello-service -D -

oc start-build hello-service --from-file hello-service/target/app.jar

oc new-app web-ui/hello-service

oc expose dc hello-service --port 8080

WEB_UI_HOST=$(oc get route -o=jsonpath='{.spec.host}'  web-ui)
oc expose service hello-service --hostname ${WEB_UI_HOST} --path /hello