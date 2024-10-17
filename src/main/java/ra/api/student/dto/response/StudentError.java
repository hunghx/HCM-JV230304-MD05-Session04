package ra.api.student.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor
@Data
public class StudentError {
    private int code;
    private String message;
    private Object errors;
}
