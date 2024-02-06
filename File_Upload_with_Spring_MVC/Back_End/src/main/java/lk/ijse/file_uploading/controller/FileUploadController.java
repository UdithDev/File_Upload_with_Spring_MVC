package lk.ijse.file_uploading.controller;

import lk.ijse.file_uploading.dto.ImageDTO;
import lk.ijse.file_uploading.service.FileUploadService;
import lk.ijse.file_uploading.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/uploads")
@CrossOrigin(origins = "http://localhost:63342")
public class FileUploadController {

    @Autowired
    private FileUploadService fileRepo;

    public FileUploadController() {
        System.out.println("Hi I am file uploader ");
    }

    @PostMapping
    public ResponseUtil uploadFile(@ModelAttribute ImageDTO dto) {
        fileRepo.saveFileLocation(dto);
        return new ResponseUtil("Ok","Successfully",null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/lastImageLoaded")
    public ResponseUtil getAllDriver() {
        return new ResponseUtil("OK", "Successfully Loaded. :", fileRepo.getLastImageLocation());
    }


}
