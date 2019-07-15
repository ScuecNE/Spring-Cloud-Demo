package com.sugus.gateway.config;

import com.sugus.gateway.filter.RateLimitByIpGatewayFilter;
import com.sugus.gateway.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class FilterConfig {

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

    @Bean
    public RateLimitByIpGatewayFilter rateLimitByIpGatewayFilter(){
        return new RateLimitByIpGatewayFilter(10, 1, Duration.ofSeconds(1));
    }

}
