package student.Service.logic;

import student.Object.ObjectClass.Student;
import student.Repository.JPA.StudentRepository_JPA;
import student.Repository.StudentRepository_lmpl;
import student.Service.StudentService_lmpl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class StudentService implements StudentService_lmpl {

    private StudentRepository_lmpl studentRepository_lmpl;

    public StudentService(){

    }
    public  StudentService(StudentRepository_lmpl studentRepository_lmpl){
        this.studentRepository_lmpl=studentRepository_lmpl;
    }
    @Override
    public void create(Student student) {
        studentRepository_lmpl.create(student);
    }

    @Override
    public void update(Student student) {
        studentRepository_lmpl.update(student);
    }

    @Override
    public void delete(String id) {
        studentRepository_lmpl.delete(id);
    }

    @Override
    public Student find(String id) {
        return studentRepository_lmpl.find(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository_lmpl.findAll();
    }
    public StudentRepository_lmpl setStudentRepository_lmpl(StudentRepository_lmpl studentRepositoryLmpl){
        StudentRepository_JPA studentRepositoryJpa=(StudentRepository_JPA) studentRepositoryLmpl;
        return studentRepositoryJpa;
    }
}
