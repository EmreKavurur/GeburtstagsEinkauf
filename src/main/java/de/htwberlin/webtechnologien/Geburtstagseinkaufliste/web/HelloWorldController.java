package de.htwberlin.webtechnologien.Geburtstagseinkaufliste.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping(path = "/")
    public ModelAndView showHelloWorldPage(){
        return new ModelAndView("helloWorld");
    }
}
