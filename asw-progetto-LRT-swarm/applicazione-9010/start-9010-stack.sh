#!/bin/bash

echo 'Starting servizio 9010 application as a stack' 

source "docker.env"

docker stack deploy --compose-file docker-stack-9010.yml applicazione-9010
