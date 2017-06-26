########################################################
# Dockerfile per l'applicazione sentence / eureka server 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/s1-service-0.0.1-SNAPSHOT.jar s1-service.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "s1-service.jar"]

