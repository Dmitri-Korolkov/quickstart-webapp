package dev.local.quickstart.webapp.jee.no.servlet;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;

public class MainHandler implements HttpHandler {

  private static final Logger log = LoggerFactory.getLogger(MainHandler.class);

  @Override
  public void handle(HttpExchange httpExchange) throws IOException {

    String response = "ok";
    httpExchange.sendResponseHeaders(200, response.length());
    OutputStream body = httpExchange.getResponseBody();
    body.write(response.getBytes("UTF-8"));
    body.close();
  }

}
