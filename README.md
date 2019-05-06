# Spring + MongoDB + Docker 테스트

## Pre Requirements

* Docker가 로컬 환경에 설치되어 있어야 합니다.

* Gradle이 설치되어 있어야 합니다.

## 실행 방법

1. spring-boot-test 디렉토리로 이동합니다.

2. ```gradle build``` 명령어를 이용하여 Spring Project를 빌드합니다.

3. ```docker build --tag spring-boot-test:0.1 .``` 명령어를 통해 Docker 이미지를 빌드합니다.

4. ```docker pull mongo:3.6``` 명령어를 통해 MongoDB 이미지를 PULL 합니다.

5. ```docker network create --attachable --driver overlay backend``` 명령어를 통해 backend라는 이름의 Overlay Network 를 생성합니다.

6. ```docker service create --name spring-boot-test -p 8080:8080 --network backend spring-boot-test:0.1``` 명령어를 통해 spring-boot-test Docker Service를 생성합니다.

7. ```docker service create --name mongodb -p 27017:27017 --network backend mongo:3.6``` 명령어를 통해 MongoDB Service를 생성합니다.

## 테스트 방법

```
curl http://localhost:8080/hello
curl -XPOST -H "Content-Type: application/json" -d '{"name":"aa","age":20}' http://localhost:8080/person
curl http://localhost:8080/person
```
