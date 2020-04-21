package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    public String wMsg;


    public WelcomeController(@Value("${welcome.message}") String message)
    {
        wMsg=message;
    }

    @GetMapping("/")
    public String sayHello() {
        return wMsg;
    }
}
