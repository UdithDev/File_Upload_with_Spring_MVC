package lk.ijse.file_uploading.config;

import lk.ijse.file_uploading.controller.FileUploadController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//child Context eka
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {FileUploadController.class})
public class WebAppConfig implements WebMvcConfigurer {
    public WebAppConfig() {
        System.out.println("child Context");
    }
}
