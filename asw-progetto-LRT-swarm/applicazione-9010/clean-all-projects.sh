#!/bin/bash

gradle clean -b eureka-server/build.gradle 
gradle clean -b s-service/build.gradle 
gradle clean -b s1-service/build.gradle 
gradle clean -b s2-service/build.gradle 
gradle clean -b zuul/build.gradle 




