package top.yangjianwu.demo.backoffice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration(proxyBeanMethods = false)
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests( authorizeRequests ->
                    authorizeRequests
                        .requestMatchers("/admin/**").hasAuthority("SCOPE_admin.read")
                        .requestMatchers("/api/**").permitAll()
                        .anyRequest().authenticated()
                )
            .oauth2ResourceServer( oauth2ResourceServer ->
                oauth2ResourceServer.jwt(jwtConfigurer -> {}));
        return http.build();
    }
}
