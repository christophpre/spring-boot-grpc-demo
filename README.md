# Demo Project for use of gRPC with Spring Boot

A quick demo project to test the usage of gRPC with Spring Boot. This demo project uses the gRPC Spring Boot Starter (https://github.com/yidongnan/grpc-spring-boot-starter).

## grpc-contract
This module contains the .proto files and defines the contract for the gRPC service. In the compile goal, the .proto files are compiled with protoc to Java classes. The grpc-contract can be distributed as a maven artifact.

## grpc-server
This module uses the grpc-contract to implement and host the gRPC service.

## grpc-client

The grpc-client uses the grpc-contract to query the grpc-server. The location of the grpc-server is configured in the application.yaml.

# Usage

Build the project
```bash
mvn clean install
```

Start the grpc-server
```bash
(cd ./grpc-server && mvn spring-boot:run)
```

Start the grpc-client
```bash
(cd ./grpc-client && mvn spring-boot:run)
```