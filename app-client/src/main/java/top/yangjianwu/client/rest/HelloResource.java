package top.yangjianwu.client.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/rest/hello")
public class HelloResource {

    private final RestTemplate restTemplate;

    public HelloResource(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String hello() {
        return restTemplate.getForObject("http://app-resource/user/hello", String.class);
    }

}
