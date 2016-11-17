package dev.local.quickstart.webapp.spring.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

  @RequestMapping(value = "/**", method = RequestMethod.GET)
  public String getMain(ModelMap model, HttpServletRequest request, HttpServletResponse response) {

    List<String> books = new ArrayList<>();
    books.add("Reactive Java Programming");
    books.add("Java Performance Companion");
    books.add("Java The Complete Reference, 8th Edition");
    books.add("Building Isomorphic JavaScript Apps");
    books.add("Absolute Java, 6th Edition");

    model.put("books", books);

    return "main";
  }

}
