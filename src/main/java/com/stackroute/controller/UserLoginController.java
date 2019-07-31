package com.stackroute.controller;

import com.stackroute.model.UserLoginInformation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //Controller annotation can be applied on classes only. It’s used to mark a class as a web request handler
public class UserLoginController
{
    @RequestMapping("/")
    //This annotation maps HTTP requests to handler methods of MVC
    //annotation is used to map Spring MVC controller methods.
    public ModelAndView modelAndView()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
    @RequestMapping("/welcome")
    public ModelAndView welcomeWebPage()
    {
        UserLoginInformation userLoginInformation=new UserLoginInformation();
        userLoginInformation.setName("ramya");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("result",userLoginInformation.getName());
        modelAndView.setViewName("welcome");
        return modelAndView;
    }


}
