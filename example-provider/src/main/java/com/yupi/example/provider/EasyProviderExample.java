package com.yupi.example.provider;

import com.yupi.example.common.service.UserService;
import com.yupi.yurpc.server.HttpServer;
import com.yupi.yurpc.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String[] args) {
//        // 创建一个HttpServer
        HttpServer server = new VertxHttpServer();
//        // 启动服务
        server.doStart(8888);
    }
}
