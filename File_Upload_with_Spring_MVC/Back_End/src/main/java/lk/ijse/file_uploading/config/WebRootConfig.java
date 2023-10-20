package lk.ijse.file_uploading.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//parent context
@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("Parent Context");
    }

    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
}
