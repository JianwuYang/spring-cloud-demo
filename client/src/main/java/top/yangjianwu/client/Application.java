package top.yangjianwu.client;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import top.yangjianwu.base.entity.AccountUser;

@SpringBootApplication
public class Application implements ApplicationRunner {

    @LoadBalanced
    @Bean
    public RestTemplate loadbalancedRestTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        AccountUser user = new AccountUser();
        user.setName("yangjianwu");
        user.setPasswd("passwd");
        RestTemplate template = this.loadbalancedRestTemplate();
        String postForObject = template.postForObject("http://app/user", user, String.class);
        System.out.println(postForObject);
    }
}
