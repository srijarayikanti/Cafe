package cafe_Management.demo.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("qa")
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()

                // API Information
                .info(new Info()
                        .title("Cafe Management System API")
                        .description("REST APIs for Cafe Management System with JWT Authentication")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Srija")
                                .email("srijarayikanti@gmail.com"))
                        .license(new License()
                                .name("Apache 2.0")))

                // JWT Security
                .addSecurityItem(new SecurityRequirement()
                        .addList("BearerAuth"))

                .components(new Components()
                        .addSecuritySchemes("BearerAuth",
                                new SecurityScheme()
                                        .name("Authorization")
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                        )
                )

                // External Docs
                .externalDocs(new ExternalDocumentation()
                        .description("GitHub Repository")
                        .url("https://github.com/srijarayikanti"));
    }
}