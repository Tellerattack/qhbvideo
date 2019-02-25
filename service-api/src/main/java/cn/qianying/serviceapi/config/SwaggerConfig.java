package cn.qianying.serviceapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 基于swagger的api文档配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.base-package:cn.qianying.serviceapi.api}")
    private String basePackage;
    @Value("${swagger.title:\u89c6\u9891\u76f4\u64ad\u7f51\u7ad9\u63a5\u53e3\u0061\u0070\u0069}")
    private String title;
    @Value("${swagger.description:\u63cf\u8ff0\u5f53\u524d\u7cfb\u7edf\u4e2d\u7684\u63a5\u53e3\u0061\u0070\u0069\u6240\u9700\u8981\u7684\u5404\u79cd\u63a5\u53e3\u53c2\u6570\u4ee5\u53ca\u63a5\u53e3\u8fd4\u56de\u7b49\u4fe1\u606f}")
    private String description;
    //"http://blog.csdn.net/saytime"
    @Value("${swagger.terms-of-service-url:http://qbvideo.com}")
    private String termsOfServiceUrl;
    @Value("${swagger.version:1.0}")
    private String version;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
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
