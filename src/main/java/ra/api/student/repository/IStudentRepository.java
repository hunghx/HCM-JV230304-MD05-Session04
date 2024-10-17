package ra.api.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.api.student.entity.Student;

public interface IStudentRepository extends JpaRepository<Student , Long> {
    boolean existsByEmail(String email);
}
