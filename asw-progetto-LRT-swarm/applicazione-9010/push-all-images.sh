#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-server-img-9010
docker push ${DOCKER_REGISTRY}/s-service-img-9010
docker push ${DOCKER_REGISTRY}/s1-service-img-9010
docker push ${DOCKER_REGISTRY}/s2-service-img-9010
docker push ${DOCKER_REGISTRY}/zuul-img-9010






