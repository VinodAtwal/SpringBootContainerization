package Docker.Tests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @GetMapping("/")
    public String helloWorld(){
        return "Containerize Spring Boot Application";
    }
}
