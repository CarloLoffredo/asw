#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker build --rm -t ${DOCKER_REGISTRY}/eureka-server-img-9010 ./eureka-server 
docker build --rm -t ${DOCKER_REGISTRY}/s-service-img-9010 ./s-service 
docker build --rm -t ${DOCKER_REGISTRY}/s1-service-img-9010 ./s1-service
docker build --rm -t ${DOCKER_REGISTRY}/s2-service-img-9010 ./s2-service
docker build --rm -t ${DOCKER_REGISTRY}/zuul-img-9010 ./zuul






