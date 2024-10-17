package ra.api.student.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import ra.api.student.validation.EmailUnique;

import java.time.LocalDate;

@Data
public class FormStudentAdd {
    @NotBlank(message = "ko đc để trống")
    private String firstName;
    @NotBlank(message = "ko đc để trống")
    private String lastName;
    @NotBlank(message = "ko đc để trống")
    @EmailUnique(message = "nhdgcdhbknsv")
    private String email;
    @NotBlank(message = "ko đc để trống")
    private String phone;
    @NotBlank(message = "ko đc để trống")
    private String address;
    @NotNull(message = "ko đc để trống")
    private Boolean sex;
    @JsonFormat(pattern = "dd/MM/yyyy",shape = JsonFormat.Shape.STRING)
    @NotNull(message = "ko đc để trống")
    private LocalDate birthDate;
}
