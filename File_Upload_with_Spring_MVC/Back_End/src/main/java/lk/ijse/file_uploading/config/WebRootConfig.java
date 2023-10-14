package lk.ijse.file_uploading.config;

import org.springframework.context.annotation.Configuration;
//parent context
@Configuration
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("Parent Context");
    }
}
