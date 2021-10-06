package com.wucy.tianfu.common.config;

import cn.dev33.satoken.interceptor.SaRouteInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)//cookie
                .allowedOriginPatterns("*")//方形哪些原始域
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .exposedHeaders("*");
    }
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 注册Sa-Token的路由拦截器，并排除登录接口或其他可匿名访问的接口地址 (与注解拦截器无关)
//        registry.addInterceptor(new SaRouteInterceptor())
//                .addPathPatterns("/**")
//                .excludePathPatterns("/user/login");
//    }
}
