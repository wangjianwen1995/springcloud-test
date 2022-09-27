package com.sxdl.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import java.util.Date;

@Component
@Slf4j
public class MyLogGateWayFilter  implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info(" ********进入全局过滤器(MyLogGateWayFilter)**********"+new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (StringUtils.isEmpty(uname)){
            log.info("*******用户名为null，非法用户，o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }


    /**
     * 过滤器优先级, 数字越小 优先等级越高
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
