package top.yangjianwu.demo.biz.service;

import org.springframework.stereotype.Service;
import top.yangjianwu.demo.base.service.biz.BizService;

@Service
public class BizServiceImpl implements BizService {

    @Override
    public String sayHello(String name) {
        return String.format("Hello, %s", name);
    }
}
