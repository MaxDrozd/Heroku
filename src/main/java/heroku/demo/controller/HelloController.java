package heroku.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping ("/hello")
    String sayhello (){
    return "<h2>Hello from controller</h2>";
}
}
