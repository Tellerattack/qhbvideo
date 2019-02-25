package cn.qianying.serviceapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 基于swagger的api文档配置
 */
@Configuration
public class SwaggerConfig {

    @Value("#{swagger.base-package}")
    private String basePackage;
    @Value("#{swagger.title}")
    private String title;
    @Value("#{swagger.description}")
    private String description;
    //"http://blog.csdn.net/saytime"
    @Value("#{swagger.terms-of-service-url}")
    private String termsOfServiceUrl;
    @Value("#{swagger.version}")
    private String version;

    /**
     * @author zh
     * @ClassName cn.saytime.Swgger2
     * @Description
     * @date 2017-07-10 22:12:31
     */
    @Configuration
    public class Swagger2 {

        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage(basePackage))
                    .paths(PathSelectors.any())
                    .build();
        }

        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title(title)
                    .description(description)
                    .termsOfServiceUrl(termsOfServiceUrl)
                    .version(version)
                    .build();
        }
    }
}
