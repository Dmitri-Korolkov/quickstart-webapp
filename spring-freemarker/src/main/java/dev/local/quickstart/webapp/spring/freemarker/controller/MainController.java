package dev.local.quickstart.webapp.spring.freemarker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {

  Logger logger = LoggerFactory.getLogger(MainController.class);

  @RequestMapping(value = "/**", method = RequestMethod.GET)
  public String mainReq(ModelMap model, HttpServletRequest request, HttpServletResponse response) {



    return "html";
  }
}
