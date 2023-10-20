package lk.ijse.file_uploading.service.impl;

import lk.ijse.file_uploading.dto.ImageDTO;
import lk.ijse.file_uploading.repo.FileUploadRepo;
import lk.ijse.file_uploading.service.FileUploadService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FileUploadServiceImpl implements FileUploadService {
    @Autowired
    private FileUploadRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveFileLocation(ImageDTO dto) {

    }

    @Override
    public String getLastImageLocation() {
        return null;
    }
}
