package ra.api.student.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ra.api.student.repository.IStudentRepository;

@Component
public class EmailConstraintValidator implements ConstraintValidator<EmailUnique, String> {
   @Autowired
    IStudentRepository studentRepository;
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean check = studentRepository.existsByEmail(s);
        return !check;
    }
}
