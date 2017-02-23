package my.project.autodealer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Nikol on 2/23/2017.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String greeting(){
        return "index";
    }

    @RequestMapping(value = "/regPage", method = RequestMethod.GET)
    public String registrationPage(){
        return "regPage";
    }
}
