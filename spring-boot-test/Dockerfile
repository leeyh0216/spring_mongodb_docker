FROM openjdk:8-jre-alpine

RUN mkdir -p /data/spring-boot-test
COPY ./build/libs/spring-boot-test.jar /data/spring-boot-test/

ENTRYPOINT ["java", "-jar", "/data/spring-boot-test/spring-boot-test.jar"]
EXPOSE 8080
