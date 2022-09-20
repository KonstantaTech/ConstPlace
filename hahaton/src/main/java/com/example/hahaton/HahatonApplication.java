package com.example.hahaton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
public class HahatonApplication {

    public static void main(String[] args) {
        SpringApplication.run(HahatonApplication.class, args);
    }

    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder(12);
    }

    @Bean
    public InternalResourceViewResolver defaultViewResolver(){
        return new InternalResourceViewResolver();
    }
}
