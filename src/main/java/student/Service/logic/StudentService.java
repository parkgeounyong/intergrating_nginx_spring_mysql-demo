package student.Service.logic;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import student.Service.StudentServicelmpl;
import student.Store.StudentStoreLmpl;
import student.object.Student;
import student.object.StudentCdo;
import student.object.StudentJpo;

@Service
@Getter
@Setter
public class StudentService implements StudentServicelmpl {
    private StudentStoreLmpl studentStoreLmpl;
    public StudentService(StudentStoreLmpl studentStoreLmpl){
        this.studentStoreLmpl=studentStoreLmpl;
    }
    @Override
    public void insert(StudentCdo studentCdo) {

        studentStoreLmpl.insert(studentCdo.toJpo());
    }


    @Override
    public Student retriveService(Long id) {
        return studentStoreLmpl.retriveStore(id);
    }

    @Override
    public void modify(Long id, StudentCdo studentCdo) {
        studentStoreLmpl.modify(id, studentCdo.toDomain());
    }
    @Override
    public void delete(Long id) {
        studentStoreLmpl.delete(id);
    }
}
