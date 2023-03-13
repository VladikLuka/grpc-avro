package com.epam;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Main {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext()
                .build();

        var client = new PingPongClient(channel);
        for (int i = 0; i < 10; i++) {
            client.sendMessage();
        }
    }
}
