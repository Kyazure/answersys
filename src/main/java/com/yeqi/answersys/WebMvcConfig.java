package com.yeqi.answersys;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * \* Created with IntelliJ IDEA.
 * \* @author: guohezuzi
 * \* Date: 2018-11-10
 * \* Time: 下午3:05
 * \* Description:spring web mvc 配置
 * \
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    @Profile({"dev", "test"})
    public void addViewControllers(ViewControllerRegistry registry) {
        //主页重定向到api文档

        registry.addRedirectViewController("/", "/docs.html");
    }
}
