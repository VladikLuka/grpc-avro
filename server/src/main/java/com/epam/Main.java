package com.epam;

import io.grpc.Server;
import io.grpc.ServerBuilder;


public class Main {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(8080)
                .addService(new PingPongServer())
                .build();

        server.start();
        server.awaitTermination();
    }
}
