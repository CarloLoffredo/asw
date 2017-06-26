#!/bin/bash

gradle build -b eureka-server/build.gradle 
gradle build -b s-service/build.gradle 
gradle build -b s1-service/build.gradle 
gradle build -b s2-service/build.gradle 
gradle build -b zuul/build.gradle 