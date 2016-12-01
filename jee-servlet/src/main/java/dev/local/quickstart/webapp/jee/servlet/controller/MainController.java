package dev.local.quickstart.webapp.jee.servlet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainController extends HttpServlet {

  private static final Logger log = LoggerFactory.getLogger(MainController.class);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
          throws ServletException, IOException {

    List<String> books = new ArrayList<>();
    books.add("Reactive Java Programming");
    books.add("Java Performance Companion");
    books.add("Java The Complete Reference, 8th Edition");
    books.add("Building Isomorphic JavaScript Apps");
    books.add("Absolute Java, 6th Edition");

    req.setAttribute("books", books);

    req.getRequestDispatcher("/WEB-INF/view/html.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
          throws ServletException, IOException {

    super.doPost(req, resp);
  }


}
