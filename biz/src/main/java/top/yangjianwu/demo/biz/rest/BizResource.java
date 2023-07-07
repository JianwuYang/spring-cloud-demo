package top.yangjianwu.demo.biz.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.yangjianwu.demo.base.entity.AccountUser;
import top.yangjianwu.demo.base.service.biz.BizService;
import top.yangjianwu.demo.biz.feign.AccountUserClient;

@RestController
@RequestMapping("/biz/test")
public class BizResource {

    private final BizService bizService;

    private final AccountUserClient accountUserClient;


    public BizResource(BizService bizService, AccountUserClient accountUserClient) {
        this.bizService = bizService;
        this.accountUserClient = accountUserClient;
    }

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return bizService.sayHello(name);
    }

    @RequestMapping("/getAccountUser")
    public AccountUser getAccountUser() {
        return accountUserClient.getUserInfo();
    }
}
