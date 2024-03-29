package lk.ijse.file_uploading.config;

import lk.ijse.file_uploading.adviser.AppWideExceptionHandler;
import lk.ijse.file_uploading.controller.FileUploadController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//child Context eka
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {FileUploadController.class, AppWideExceptionHandler.class})
public class WebAppConfig implements WebMvcConfigurer {
    public WebAppConfig() {
        System.out.println("child Context");
    }

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(900000000);
        return multipartResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploads/**").addResourceLocations("/uploads/");
    }
}
