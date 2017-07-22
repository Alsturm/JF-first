package ru.training.jf.io.http;

import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

@Log4j2
public class SocketProcessor implements Runnable {

    public static final String RESPONSE =
            "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/html\r\n" +
                    "Content-Length: %d\r\n" +
                    "Connection: close\r\n\r\n%s";

    private Socket s;
    private InputStream is;
    private OutputStream os;

    SocketProcessor(Socket s) throws Throwable {
        this.s = s;
        is = s.getInputStream();
        os = s.getOutputStream();
    }

    public void run() {
        try {
            writeResponse(
                    mapRequest(getHttpRequest())
            );
        } catch (Throwable t) {
                /*do nothing*/
        } finally {
            try {
                s.close();
            } catch (Throwable t) {
                    /*do nothing*/
            }
        }
        log.info("Client processing finished");
    }

    private String mapRequest(HttpRequest httpRequest) {
        return "<html><body><h1>Привет от Habrahabr`а!..</h1></body></html>";
    }

    private void writeResponse(String s) throws Throwable {
        os.write(String.format(RESPONSE, s.length(), s).getBytes());
        os.flush();
    }

    private HttpRequest getHttpRequest() throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s;
        while ((s = br.readLine()) != null && !s.trim().isEmpty()) {
            // TODO: 22/07/2017 сохранить заголовки в экземпляр интерфейса запроса
            log.info(s);
        }
        return HttpRequest.from(null, null, null, null, null);
    }
}