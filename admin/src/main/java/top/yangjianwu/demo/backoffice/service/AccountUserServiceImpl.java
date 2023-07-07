package top.yangjianwu.demo.backoffice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.yangjianwu.demo.base.entity.AccountUser;
import top.yangjianwu.demo.base.service.admin.AccountUserService;

@Slf4j
@Service
public class AccountUserServiceImpl implements AccountUserService {

    @Override
    public AccountUser getUserInfo() {
        log.info("获取用户============");
        return new AccountUser("yangjianwu", "8888");
    }
}
