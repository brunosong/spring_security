package bruno.study.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }


    @ResponseBody
    @GetMapping("/user")
    public String user() {
        return "User";
    }


    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}
