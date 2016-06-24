package ru.kutepov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


@SpringBootApplication
public class SpringBootProjectApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(SpringBootProjectApplication.class);
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(new Class<?>[]{SpringBootProjectApplication.class, DBConfig.class}, args);
  }
}

