package top.yangjianwu.app.rest;

import org.springframework.web.bind.annotation.*;
import top.yangjianwu.base.entity.AccountUser;

@RequestMapping("/user")
@RestController
public class UserResource {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World";
    }

    @GetMapping("/authData")
    public String authData() {
        return "authData";
    }

    @PostMapping("/authData/print")
    public String print(@RequestBody AccountUser user) {
        return user.toString();
    }

}
