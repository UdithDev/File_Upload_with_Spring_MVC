package lk.ijse.file_uploading.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//child Context eka
@Configuration
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
    public WebAppConfig() {
        System.out.println("child Context");
    }
}
