package top.yangjianwu.demo.qms.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.yangjianwu.demo.base.entity.AccountUser;
import top.yangjianwu.demo.base.service.biz.BizService;
import top.yangjianwu.demo.qms.feign.AccountUserClient;

@RestController
@RequestMapping("/qms/test")
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
