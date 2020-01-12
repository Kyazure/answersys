package com.yeqi.answersys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName:Swagger2
 * @author: yeqi
 * @create: 2020/1/6 18:46
 * @description
 */
@EnableSwagger2
@Configuration
public class Swagger2 {
    private final Contact DEFAULT_CONTACT = new Contact(
            "guohezuzi",
            "http://www.guohezuzi.cn",
            "guohezuzip@gmail.com");

    private final ApiInfo DEFAULT_API_INFO = new ApiInfo(
            "答题小程序API文档",
            "答题小程序api文档",
            "1.0",
            "#",
            DEFAULT_CONTACT,
            "",
            "#",
            Collections.emptyList());

    private final Set<String> DEFAULT_PRODUCES_AND_CONSUMES =
            new HashSet<>(Collections.singletonList("application/json"));

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }
}

