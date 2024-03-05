package com.yupi.yurpc.server;

import io.vertx.core.Vertx;

public class VertxHttpServer implements HttpServer {
    public void doStart(int port) {
        // 创建Vert.x实例
        Vertx vertx = Vertx.vertx();

        // 创建HTTP服务器
        io.vertx.core.http
                .HttpServer server = vertx.createHttpServer();

        // 监听端口，并处理请求
        server.requestHandler(new HttpServerHandler());

        // 启动服务器
        server.listen(port, res -> {
            if (res.succeeded()) {
                System.out.println("Server started on port " + port);
            } else {
                System.out.println("Failed to start server on port " + res.cause());
            }
        });
    }
}
