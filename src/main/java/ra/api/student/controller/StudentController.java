package ra.api.student.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.api.student.dto.request.FormStudentAdd;
import ra.api.student.dto.response.StudentResponse;
import ra.api.student.entity.Student;
import ra.api.student.service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/api.hunghx.com/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    // lấy danh sách sinh viên
    @GetMapping
    public ResponseEntity<StudentResponse> getAll(){
        List<Student> list = studentService.findAll();
//        return new ResponseEntity<>(new StudentResponse(list,HttpStatus.OK), HttpStatus.OK);
        return ResponseEntity.ok().body(new StudentResponse(list,HttpStatus.OK,HttpStatus.OK.value()));
    }

    // thêm mới
    @PostMapping
    public ResponseEntity<StudentResponse> create(@Valid @RequestBody FormStudentAdd request) {// MethodArgumentInvalidException{
        Student student = studentService.create(request);
        return new ResponseEntity<>(
                new StudentResponse(student,HttpStatus.CREATED,HttpStatus.CREATED.value())
                ,HttpStatus.CREATED
        );
    }
    // lấy theo id
//    @GetMapping("/{id}")
//    public ResponseEntity<?> findById(@PathVariable Long id){
//
//    }
    // sửa
//    @PutMapping("/{id}")
    // xóa
//    @DeleteMapping("/{id}")

    // tính năng san phẩm danh mục (nhiều - nhiêu)
    // thêm sản phẩm cho danh mục , xóa 1 sản phẩm trong danh mục

    // /api.example.com/catalog/{catalog}/product/{productId} (Post)      (thêm sản phẩm ko phải tạo mới)
    // /api.example.com/catalog/{catalog}/product/{productId} (Delete)      (loại bỏ sản phẩm ko phải tạo mới)

}
