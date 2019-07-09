package com.sugus.gateway.config;

import com.sugus.gateway.router.ConsumerRouter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {

    @Bean
    public RouteLocator consumerRouter(RouteLocatorBuilder builder) {
        return new ConsumerRouter().consumerRouteLocator(builder);
    }

}
