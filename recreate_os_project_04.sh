#!/usr/bin/env bash

set -e

oc new-app web-ui/web-ui

oc expose dc web-ui --port 8080

oc expose service web-ui