package student.Store.logic;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import student.Store.Jpa.StudentStoreJpa;
import student.Store.StudentStoreLmpl;
import student.object.Student;
import student.object.StudentCdo;
import student.object.StudentJpo;

import java.util.List;
import java.util.Optional;

@Repository
@Getter
@Setter
public class StudentStore implements StudentStoreLmpl {
    private StudentStoreJpa studentStoreJpa;

    public StudentStore(StudentStoreJpa studentStoreJpa){
        this.studentStoreJpa=studentStoreJpa;
    }

    @Override
    public void insert(StudentJpo studentJpo) {
        studentStoreJpa.save(studentJpo);
    }

    @Override
    public Student retriveStore(Long id) {
        Optional<StudentJpo> studentJpo=studentStoreJpa.findById(id);
        return studentJpo.get().toDomain();
    }

    @Override
    public void modify(Long id, Student student) {
        studentStoreJpa.deleteById(id);
        studentStoreJpa.save(student.toJpo());
    }

    @Override
    public void delete(Long id) {
        studentStoreJpa.deleteById(id);
    }
}
