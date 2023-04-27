package top.yangjianwu.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration(proxyBeanMethods = false)
public class ResourceServerConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                authorizeHttpRequests -> authorizeHttpRequests
                        .requestMatchers("/user/authData").hasAnyAuthority("SCOPE_app.read")
                        .anyRequest().authenticated())
                .oauth2ResourceServer(server -> server.jwt());
        return http.build();
    }
}