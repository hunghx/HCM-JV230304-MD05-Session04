package ra.api.student.service;

import ra.api.student.dto.request.FormStudentAdd;
import ra.api.student.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student create(FormStudentAdd request);

}
