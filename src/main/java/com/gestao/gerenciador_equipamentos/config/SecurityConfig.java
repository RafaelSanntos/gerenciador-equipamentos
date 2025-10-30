package com.gestao.gerenciador_equipamentos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // libera tudo
                )
                .csrf(csrf -> csrf.disable()) // desativa proteção CSRF (apenas pra dev)
                .formLogin(login -> login.disable()) // desativa tela de login
                .httpBasic(basic -> basic.disable()); // desativa autenticação básica

        return http.build();
    }
}
