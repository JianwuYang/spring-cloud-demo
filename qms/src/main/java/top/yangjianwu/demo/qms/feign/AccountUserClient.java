package top.yangjianwu.demo.qms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.yangjianwu.demo.base.entity.AccountUser;

@FeignClient("admin")
public interface AccountUserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/admin/accountUser/getUserInfo")
    AccountUser getUserInfo();
}
