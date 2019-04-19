FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD eureka-server-docker-1.0-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["nohup","java","-jar","eureka-server.jar",">>","eureka-serve888.log","2>&1","&"]