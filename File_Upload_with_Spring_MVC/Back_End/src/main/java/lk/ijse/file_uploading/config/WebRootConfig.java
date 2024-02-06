package lk.ijse.file_uploading.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//parent context
@Configuration
@Import(JPAConfig.class)
@ComponentScan(basePackages = "lk.ijse.file_uploading.service")
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("Parent Context");
    }

    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
}
