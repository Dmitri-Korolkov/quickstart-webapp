package dev.local.quickstart.webapp.jee.servlet.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainFilter implements Filter {

  private static final Logger log = LoggerFactory.getLogger(MainFilter.class);

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
          throws IOException, ServletException {

    HttpServletResponse response = (HttpServletResponse) servletResponse;
    HttpServletRequest request = (HttpServletRequest) servletRequest;

    request.setCharacterEncoding("UTF-8");

    if (request.getRequestURL().toString().endsWith("/") && !request.getRequestURI().equals("/")) {
      response.sendRedirect(request.getRequestURL().toString().replaceAll(".$", ""));
      return;
    }

    if (request.getRequestURI().startsWith("/static/") || request.getRequestURI().startsWith("/WEB-INF/")) {
      filterChain.doFilter(request, response);
      return;
    }

    if (request.getSession().getAttribute("userRole") == null) {
      request.getSession().setAttribute("userRole", "ANONIM");
    }

    filterChain.doFilter(request, response);
  }

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void destroy() {

  }
}
