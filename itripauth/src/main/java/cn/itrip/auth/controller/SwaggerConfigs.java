/*
package cn.itrip.auth.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
    @EnableSwagger2
    @ComponentScan(basePackages ="cn.itrip.auth.controller" )
    @Configuration
    public class SwaggerConfig extends WebMvcConfigurationSupport {
        */
/**
         * 创建API应用
         * apiInfo() 增加API相关信息
         * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
         * 本例采用指定扫描的包路径来定义指定要建立API的目录。
         *//*

        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("cn.appsys.controller"))
                    .paths(PathSelectors.any())
                    .build();
        }

        */
/**
         * 创建该API的基本信息（这些基本信息会展现在文档页面中）
         * 访问地址：http://ip:port/swagger-ui.html
         *//*

        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("APP信息管理平台-主业务模块API") //标题。
                    .termsOfServiceUrl("http://127.0.0.1:8084/auth/swagger-ui.html")
                    .contact("飞哥项目团队")  //开发团队名称
                    .version("1.0")   //版本
                    .build();
        }
    }

*/
