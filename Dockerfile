FROM amazoncorretto:17-alpine-jdk

MAINTAINER KarinSD

COPY target/karin-0.0.1-SNAPSHOT.jar karin-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/karin-0.0.1-SNAPSHOT.jar"]