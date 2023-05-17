package student.Controller;

import student.Object.ObjectClass.Student;
import student.Service.StudentService_lmpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService_lmpl studentService_lmpl;
    public StudentController(StudentService_lmpl studentService_lmpl){
        this.studentService_lmpl=studentService_lmpl;
    }
    @PostMapping
    public void create(@RequestBody Student student){
        studentService_lmpl.create(student);
    }
    @PutMapping
    public void update(@RequestBody Student student){
        studentService_lmpl.update(student);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        studentService_lmpl.delete(id);
    }
    @GetMapping("/{id}")
    public Student find(@PathVariable String id){
        return studentService_lmpl.find(id);
    }
    @GetMapping("/all")
    public List<Student> findAll(){
        return studentService_lmpl.findAll();
    }
}
