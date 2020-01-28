package hu.flowacademy.musicstore.Exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler extends Throwable {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity handleRuntimeException() {
        System.err.println("You've got BAD REQUEST");
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }


}
