package Controller;


import Object.ObjectClass.Student;
import Service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    //REST API 구현(put, push, get, delete)
    StudentService studentService;
    public Student find(int id){

    }
    public List<Student> findAll(){

    }

    public String delete(int id){
        return "delete complete";
    }

    public String modify(){

    }
}
