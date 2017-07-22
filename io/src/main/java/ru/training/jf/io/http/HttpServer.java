package ru.training.jf.io.http;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import java.net.ServerSocket;
import java.net.Socket;

@Log4j2
public class HttpServer {

    @SneakyThrows
    public static void main(String... args) {
        try (ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]))) {
            while (!Thread.currentThread().isInterrupted()) {
                Socket s = ss.accept();
                log.info("Client accepted");
                new Thread(new SocketProcessor(s)).start();
            }
        }
    }
}
