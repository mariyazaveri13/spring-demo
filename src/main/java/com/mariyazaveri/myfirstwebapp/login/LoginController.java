package com.mariyazaveri.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    //when you want to pass something to jsp you use model
    public String goToLogin(@RequestParam String name, ModelMap model){
        //model is used to send data over to jsp
        model.put("name",name);
        //below used curly braces and works for replacing the name variable
        logger.debug("Name is ==>>{}",name);
        //returns the name of jsp. prefix and suffix are mentioned in application properties
        return "login";
    }
}
