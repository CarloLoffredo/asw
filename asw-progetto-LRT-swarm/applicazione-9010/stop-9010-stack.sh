#!/bin/bash

echo 'Removing sentence application as a stack' 

source "docker.env"

docker stack rm applicazione-9010
