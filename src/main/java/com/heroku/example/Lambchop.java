package com.heroku.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Lambchop {
  public static void main(String[] a) throws Exception {
    String providedPort = System.getProperty("port", System.getenv("PORT"));
    int port = Integer.valueOf(providedPort != null ? providedPort : "8080");

    Server server = new Server(port);

    ServletContextHandler context = new ServletContextHandler(server, "/");
    context.addServlet(LambdaServlet.class, "/");

    server.start();
    server.join();
  }
}
