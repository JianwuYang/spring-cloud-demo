package top.yangjianwu.demo.backoffice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestApiResource {


    @GetMapping
    public String hello() {
        return "Hello, World";
    }
}
