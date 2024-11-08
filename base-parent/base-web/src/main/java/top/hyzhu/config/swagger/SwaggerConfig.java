package top.hyzhu.config.swagger;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-11-08 15:00
 **/

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("通⽤权限管理系统API")
                        .contact(new Contact().name("hyzhu").email("2499669698.@qq.com"))
                        .version("1.0")
                        .description("通⽤权限管理系统接⼝⽂档")
                        .license(new License().name("Apache 2.0").url("http://doc.xiaominfo.com")));
    }
}
