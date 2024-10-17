package ra.api.student.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ra.api.student.dto.response.StudentError;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class APIControllerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleBadRequest(MethodArgumentNotValidException e){
        // lọc lỗi
        // details [{field : name , message : "ko trùng lặp"}]
        Map<String , String> details = new HashMap<>();
        e.getFieldErrors().forEach(fieldError -> {
            details.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        StudentError studentError = new StudentError(400,"Bad Request - parameter incorrect",details);
        Map<String, Object> response = new HashMap<>();
        response.put("error",studentError);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
