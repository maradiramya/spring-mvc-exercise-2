package com.stackroute.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class UserLoginInitializer extends AbstractAnnotationConfigDispatcherServletInitializer //this initializes spring dispatcher servlet and register with spring dispatcher servelet and creates the web application
{

    @Override
    protected Class<?>[] getRootConfigClasses() {  //redirects to configuration class
        return new Class[]{UserLoginConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() { //used for mapping http request  to controller
        return new String[]{"/"};
    }
}
