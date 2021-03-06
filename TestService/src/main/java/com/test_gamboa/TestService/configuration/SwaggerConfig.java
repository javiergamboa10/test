package com.test_gamboa.TestService.configuration;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build()
                .enableUrlTemplating(false)
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false);
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Servicio utilizado para realizar la prueba de ingreso",
                "Este servicio fue desarrollado como entrenamiento.",
                "API v1",
                "Terms of service",
                new Contact("Javier Gamboa", "", ""),
                "License of API", "API license URL", Collections.emptyList());
    }
}