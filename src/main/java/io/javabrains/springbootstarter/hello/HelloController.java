package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // mark klass as controller
public class HelloController {

    @RequestMapping("/hello") //
    public String sayHi() {
        return "Hi";
    }
}
