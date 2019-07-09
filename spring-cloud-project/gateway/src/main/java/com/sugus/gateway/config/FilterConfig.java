package com.sugus.gateway.config;

import com.sugus.gateway.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

}
