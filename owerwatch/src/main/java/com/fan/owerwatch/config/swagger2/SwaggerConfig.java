package com.fan.owerwatch.config.swagger2;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @description:swagger2配置类
 * @project: owerwatch
 * @author: Admin
 * @date: 2019/9/25 15:46
 */

//@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fan.owerwatch.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo createApiInfo() {
        return new ApiInfoBuilder().title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更多知识请看博客:https://blog.csdn.net/qq_28988969")
                .termsOfServiceUrl("127.0.0.1:8080/swagger-ui.html#/")
                .version("1.0")
                .build();
    }
}
