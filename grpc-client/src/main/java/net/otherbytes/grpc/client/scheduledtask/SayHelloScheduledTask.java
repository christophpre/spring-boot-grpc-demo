package net.otherbytes.grpc.client.scheduledtask;

import net.otherbytes.grpc.contract.HelloReply;
import net.otherbytes.grpc.contract.HelloRequest;
import net.otherbytes.grpc.contract.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SayHelloScheduledTask {
    @GrpcClient("hello-service")
    private HelloServiceGrpc.HelloServiceBlockingStub helloServiceStub;

    @Scheduled(fixedRate = 5000)
    public void execute() {
        HelloReply response = helloServiceStub.sayHello(HelloRequest.newBuilder().setName("test").build());
        System.out.println("Received response from HelloService: " + response.getMessage());
    }
}
