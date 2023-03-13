package com.epam;

import com.epam.grpc.PingPong;
import com.epam.grpc.PingPongServiceGrpc;
import io.grpc.Channel;


public class PingPongClient {

    private final PingPongServiceGrpc.PingPongServiceBlockingStub stub;

    public PingPongClient(Channel channel){
        this.stub = PingPongServiceGrpc.newBlockingStub(channel);
    }

    public void sendMessage(){
        PingPong.PingRequest message = PingPong.PingRequest.newBuilder()
                .setMessage("ping")
                .setTimestamp(System.currentTimeMillis())
                .build();

        PingPong.PongResponse pongResponse = stub.pingPong(message);

        System.out.println(pongResponse);
    }
}
