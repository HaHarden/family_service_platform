package com.mashibing.config;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

//前后端跨域的配置的类，取消注解则不影响
//@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //设置属性
        //允许跨域请求的地址，*表示所有
        corsConfiguration.addAllowedOrigin("*");
        //请求头
        corsConfiguration.addAllowedHeader("*");
        //请求方法
        corsConfiguration.addAllowedMethod("*");
        //设置跨域请求是否是同一个session
        corsConfiguration.setAllowCredentials(true);
        return corsConfiguration;
    }

    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",buildConfig());
        return new CorsFilter();
    }
}
