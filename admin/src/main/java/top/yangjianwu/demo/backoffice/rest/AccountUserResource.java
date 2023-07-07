package top.yangjianwu.demo.backoffice.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yangjianwu.demo.base.entity.AccountUser;
import top.yangjianwu.demo.base.service.admin.AccountUserService;

@RestController
@RequestMapping("/admin/accountUser")
public class AccountUserResource {

    private final AccountUserService accountUserService;

    public AccountUserResource(AccountUserService accountUserService) {
        this.accountUserService = accountUserService;
    }

    @RequestMapping("/getUserInfo")
    public AccountUser getUserInfo() {
        return accountUserService.getUserInfo();
    }
}
