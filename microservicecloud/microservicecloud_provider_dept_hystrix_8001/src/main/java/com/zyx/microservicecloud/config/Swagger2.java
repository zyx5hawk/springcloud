package com.zyx.microservicecloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//@Configuration
//public class Swagger2 {
//	@Bean
//	public Docket createRestApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.apiInfo(apiInfo())
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.zyx.microservicecloud.controller"))
//				.paths(PathSelectors.any())
//				.build();
//	}
//	
//	@SuppressWarnings("deprecation")
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder()
//				.title("Springboot builds the API documentation with swagger")
//				.description("Simple and elegant restfun style")
//				.termsOfServiceUrl("http://localhost")
//				.contact("Yingxin ZHAO")
//				.version("1.0")
//				.build();
//	}
//}
