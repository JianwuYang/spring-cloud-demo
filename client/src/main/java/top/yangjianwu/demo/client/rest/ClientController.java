package top.yangjianwu.demo.client.rest;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import top.yangjianwu.demo.base.entity.AccountUser;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@RestController
public class ClientController {

    private final WebClient webClient;

    public ClientController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/getUserInfo")
    public AccountUser getUserInfo(@RegisteredOAuth2AuthorizedClient("client-authorization-code") OAuth2AuthorizedClient authorizedClient) {
        return this.webClient
                .get()
                .uri("http://127.0.0.1:8081/admin/accountUser/getUserInfo")
                .attributes(oauth2AuthorizedClient(authorizedClient))
                .retrieve()
                .bodyToMono(AccountUser.class)
                .block();
    }
}
