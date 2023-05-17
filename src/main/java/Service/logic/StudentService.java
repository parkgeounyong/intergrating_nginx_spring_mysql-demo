package Service.logic;

import Object.ObjectClass.Student;
import Service.StudentService_lmpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentService_lmpl {

    private StudentService_lmpl studentService_lmpl;
    public  StudentService(StudentService_lmpl studentService_lmpl){
        this.studentService_lmpl=studentService_lmpl;
    }
    @Override
    public void create(Student student) {
        studentService_lmpl.create(student);
    }

    @Override
    public void update(Student student) {
        studentService_lmpl.update(student);
    }

    @Override
    public void delete(int id) {
        studentService_lmpl.delete(id);
    }

    @Override
    public Student find(int id) {
        return studentService_lmpl.find(id);
    }

    @Override
    public List<Student> findAll() {
        return studentService_lmpl.findAll();
    }
}
