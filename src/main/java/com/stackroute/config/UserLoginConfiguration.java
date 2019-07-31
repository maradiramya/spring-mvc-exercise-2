package com.stackroute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration // it is indicates that class has @Bean definition methods from this spring container can generate beans for class
@EnableWebMvc  //is used to enable Spring MVC, It enables support for @Controller-annotated classes that use @RequestMapping to map incoming requests to a certain method.
@ComponentScan(basePackages = "com.stackroute") //to specify the packages that we want to be scanned.

public class UserLoginConfiguration {
    @Bean //Indicates that a method produces a bean to be managed by the Spring container.
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;

    }
}
