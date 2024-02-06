package lk.ijse.file_uploading.adviser;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({RuntimeException.class})
    public void handleMyExceptions(RuntimeException e){
        System.out.println(e.getMessage());

    }
}
