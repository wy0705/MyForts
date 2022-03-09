package com.pjmike.netty.utils;

import com.pjmike.netty.protocol.protobuf.MessageBase;
import com.pjmike.netty.server.NettyServer;

import java.util.UUID;

/**
 * @author pjmike
 * @create 2018-10-27 0:35
 */
public class MessageBaseTest {
    public static void main(String[] args) {
        MessageBase.Message message = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setContent("hello world").build();
        System.out.println("message: "+message.toString());
        /*NettyServer nettyServer=new NettyServer();
        try {
            nettyServer.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
