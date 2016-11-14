package dev.local.quickstart.webapp.spring.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {

  @RequestMapping(value = "/**", method = RequestMethod.GET)
  public String getMain(ModelMap model, HttpServletRequest request, HttpServletResponse response) {


    System.out.println("*********************************************");

    return "main";
  }

}
