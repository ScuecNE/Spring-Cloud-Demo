package com.sugus.gateway.router;

import com.sugus.gateway.filter.RateLimitByIpGatewayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

import java.time.Duration;

public class ConsumerRouter {

    public RouteLocator consumerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/consumer/**")
                        .filters(f -> f.stripPrefix(1)
                                .addResponseHeader("X-Response-Default-Foo", "Default-Bar")
                                .filter(new RateLimitByIpGatewayFilter(10, 1, Duration.ofSeconds(1))))
                        .uri("lb://CONSUMER")
                        .order(0)
                        .id("consumer")).build();
    }

}
