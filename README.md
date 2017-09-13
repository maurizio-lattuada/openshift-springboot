###### Software Catering Training
#### Workshop: Kickstarter Openshift & Spring Boot  https://github.com/software-catering/training-openshift-springboot
# step_3: create & run build on OpenShift

## Todo:
* create build configuration with openshift cli:
  * name it `web-ui`
  * use the existing docker file
* start the build (uploading the app.jar file)

## Hints
* `$ oc new-build --help`
* `$ oc run-build --help`
* `$ oc get bc`
* https://docs.openshift.com/container-platform/3.6/dev_guide/builds/index.html  