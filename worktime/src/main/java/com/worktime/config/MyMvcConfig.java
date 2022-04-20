package com.worktime.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.List;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Resource
    private PathConfiguration configuration;

    //网址映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("index");
    }

    //判断是否登录成功
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //String[] b = a.split(".");
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")//所有地址都需要权限验证
                .excludePathPatterns("/","/login.html","/user/login","/assets/**","/css/**","/images/**","/js/**","/vendors/**","/webfonts/**");//除了括号中的地址

    }
}
