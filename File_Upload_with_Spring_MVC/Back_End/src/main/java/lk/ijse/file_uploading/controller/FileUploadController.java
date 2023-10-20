package lk.ijse.file_uploading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uploads")
public class FileUploadController {

    public FileUploadController() {
        System.out.println("Hi I am file uploader ");
    }

    @PostMapping
    public String uploadFile() {
        return "post method invoked";
    }

    @GetMapping
    public String getAllDriver() {
        return "Get method Invoked";
    }


}
