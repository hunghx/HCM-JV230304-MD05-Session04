package ra.api.student.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.api.student.dto.request.FormStudentAdd;
import ra.api.student.entity.Student;
import ra.api.student.repository.IStudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;
    @Autowired
    private ModelMapper mapper;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student create(FormStudentAdd request) {
        Student student = mapper.map(request, Student.class);
        return studentRepository.save(student);
    }
}
