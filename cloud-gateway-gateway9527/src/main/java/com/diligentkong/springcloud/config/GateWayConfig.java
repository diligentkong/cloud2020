package com.diligentkong.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author diligentkong
 * @date 2020/8/27 0027 9:54
 */
@Configuration
public class GateWayConfig {
    /**
     * 配置了一个id为route-name的路由规则
     * 当访问地址为http://localhost:9527/guonei时会自动转发到地址https://news.baidu.com/guonei
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_diligentkong",
                r -> r.path("/guonei")
                        .uri("https://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
