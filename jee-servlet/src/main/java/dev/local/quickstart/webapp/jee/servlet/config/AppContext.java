package dev.local.quickstart.webapp.jee.servlet.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class AppContext {

  private static final Logger log = LoggerFactory.getLogger(AppContext.class);

  private static AppContext instance;

  private Properties prop;

  private Map<String, Object> beans;

  private AppContext() {

    beans = new HashMap<>();
    prop = new Properties();

    try (InputStream input = AppContext.class.getClassLoader().getResourceAsStream("application.properties")) {

      if (input == null){
        log.error("application properties not found");
        System.exit(-1);
      }

      prop.load(input);
    } catch (Exception e) {
      log.error("read properties error: {}", e);
    }

    //// TODO: initialize beans and put to map

    log.info("application {}: started", prop.getProperty("app.name"));
  }

  public static Object getBean(String name) {
    if (instance == null) instance = new AppContext();
    return instance.beans.get(name);
  }

}
