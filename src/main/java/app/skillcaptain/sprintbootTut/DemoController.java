package app.skillcaptain.sprintbootTut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "<h1 style=\"color: red\">Hello World!</h1>";
    }

    @GetMapping("/vatsal")
    public String helloVatsal(){
        return "<h1 style=\"color: red\">Hello Vatsal!</h1>";
    }

    @GetMapping("/param")
    public String helloWorldWithParam(@RequestParam("name") String parameter){
        return "<h1 style=\"color: red\">Hello </h1>" + " to " + parameter;
    }

    @GetMapping("/path/{id}")
    public String helloWorldWithPathParam(@PathVariable String id){
        return "<h1 style=\"color: red\">Hello </h1>" + " id is " + id;
    }
}
