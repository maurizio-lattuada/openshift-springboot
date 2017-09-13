###### Software Catering Training
#### Workshop: Kickstarter Openshift & Spring Boot  https://github.com/software-catering/training-openshift-springboot
# step_2: run web-ui in Docker

## Todo:
* create a Dockerfile:
    * based on `openjdk:8-jre-alpine` (https://hub.docker.com/_/openjdk/)
    * add the fat-jar of the web-ui
    * make sure the jar is started (hint: `CMD`)
* build the docker image with tag `web-ui
* run the docker image
* check if it's working: http://localhost:8080/      

## Hints:
* https://docs.docker.com/engine/reference/builder/
* `$ docker run --help`