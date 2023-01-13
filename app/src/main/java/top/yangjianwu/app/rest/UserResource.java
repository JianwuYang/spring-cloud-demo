package top.yangjianwu.app.rest;

import org.springframework.web.bind.annotation.*;
import top.yangjianwu.base.entity.AccountUser;

@RequestMapping("/user")
@RestController
public class UserResource {

    @PostMapping
    public String hello(@RequestBody AccountUser user) {
        return user.toString();
    }

}
