package main.finale.KasService;

import com.sun.net.httpserver.BasicAuthenticator;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/*
 * a simple static http server
 */
public class DummyKas {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(11005), 0);
        System.out.println("Server Started..! at 11005 port");
        server.createContext("/kas/getkey", new MyHandler()).setAuthenticator(new BasicAuthenticator("get") {
            @Override
            public boolean checkCredentials(String user, String pwd) {
                return user.equals("VA_PDSP_USR_DEV") && pwd.equals("p@&&W0rD");
            }
        });

        server.createContext("/kas/getkey/K0001", new MyHandlerwithAlias()).setAuthenticator(new BasicAuthenticator("post") {
            @Override
            public boolean checkCredentials(String user, String pwd) {
                return user.equals("VA_PDSP_USR_DEV") && pwd.equals("p@&&W0rD");
            }
        });

        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class MyHandler implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            byte[] response = new byte[0];
            if ("GET".equals(t.getRequestMethod()) && "/kas/getkey".equals(t.getRequestURI().getPath())) {
                System.out.println("received " + t.getRequestMethod() + " request on:" + t.getRequestURI() + "\tSUCCESS");
                response = ("{\n" +
                        "\n" +
                        "\"keyAlias\":\"K0001\",\n" +
                        "\n" +
                        "\"keyData\":\"21cf177577fd1113e9c37e9325cc32bdab3a029d08f1dda4f133f19e0d73a8a8\",\n" +
                        "\n" +
                        "\"expirationDate\":\"2021-08-02T06:55:12.322Z\"\n" +
                        "\n" +
                        "}").getBytes();
                t.sendResponseHeaders(201, response.length);
            } else {
                System.out.println("received " + t.getRequestMethod() + " request on:" + t.getRequestURI() + "\tERROR, Wrong API, use \"GET /kas/getkey\"");
                t.sendResponseHeaders(404, 0);
            }
            OutputStream os = t.getResponseBody();
            os.write(response);
            os.close();
        }
    }

    static class MyHandlerwithAlias implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            byte[] response = new byte[0];
            if ("POST".equals(t.getRequestMethod()) && "/kas/getkey/K0001".equals(t.getRequestURI().getPath())) {
                System.out.println("received " + t.getRequestMethod() + " request on:" + t.getRequestURI() + "\tSUCCESS");
                response = ("{\n" +
                        "\n" +
                        "\"keyAlias\":\"K0001\",\n" +
                        "\n" +
                        "\"keyData\":\"21cf177577fd1113e9c37e9325cc32bdab3a029d08f1dda4f133f19e0d73a8a8\",\n" +
                        "\n" +
                        "}").getBytes();
                t.sendResponseHeaders(200, response.length);
            } else {
                System.out.println("received " + t.getRequestMethod() + " request on:" + t.getRequestURI() + "\tERROR, Wrong API, use \"POST /kas/getkey/K0001\"");
                t.sendResponseHeaders(404, 0);
            }
            OutputStream os = t.getResponseBody();
            os.write(response);
            os.close();
        }
    }


}