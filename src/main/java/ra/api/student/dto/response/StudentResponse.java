package ra.api.student.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import ra.api.student.entity.Student;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentResponse {
    private Object data;
    private HttpStatus httpStatus;
    private int code;
}
