#
# Package stage
#
FROM openjdk:11-jre-slim
COPY ./build/libs/*-SNAPSHOT.jar /home/app/server.jar
ENTRYPOINT ["java","-jar","/home/app/server.jar"]