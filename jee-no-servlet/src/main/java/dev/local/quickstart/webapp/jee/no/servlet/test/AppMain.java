package dev.local.quickstart.webapp.jee.no.servlet.test;

import com.sun.net.httpserver.HttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class AppMain {

  private static final Logger log = LoggerFactory.getLogger(AppMain.class);

  public static void main(String[] args) throws IOException {

    int port = 8888;

    HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
    server.createContext("/", new MainHandler());
    server.setExecutor(Executors.newCachedThreadPool());
    server.start();
  }

}
