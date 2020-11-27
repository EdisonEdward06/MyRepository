package com.docker.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message: Puja}")
    private String message;

    private List<String> tasks = Arrays.asList("First of all , What you did was right , you made a right choice, You would be better than here."
    		 , " And I got a good friend from verizon ", 
    		 "You are always a critical resource for me  , Keep up the good work",
    		 "Would be missing  you chat in jabber", 
    		 "Stay safe and healthy, try not being an potato", "We will be a friends series mate forever", "Byeeeee buddyyyyy tc");

    
    @GetMapping("/messageFromEddie")
    public String main(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);

        return "welcome"; //view
    }

    // /hello?name=kotlin
    @GetMapping("/hello")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {
 
    	if(name == null ) {
    		name = "buddy";
    	}
        model.addAttribute("message", name);

        return "welcome"; //view
    }

}