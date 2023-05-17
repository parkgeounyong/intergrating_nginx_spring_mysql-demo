package student.Repository.JPA;

import student.Object.JPO.StudentJPO;
import student.Object.ObjectClass.Student;
import student.Repository.db_lmpl.StudentStore;
import student.Repository.StudentRepository_lmpl;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class StudentRepository_JPA implements StudentRepository_lmpl {

    private StudentStore studentStore;
    //DB 자동 연결

    //여기에서 DB에 저장할 대는 jpo 객체로 불러올 때는 도메인으로 변경 필요
    @Override
    public void create(Student student) {
        studentStore.save(new StudentJPO(student));
    }

    @Override
    public void update(Student student) {
        studentStore.save(new StudentJPO(student));
    }



    @Override
    public Student find(String id) {
        Optional<StudentJPO> Student= studentStore.findById(id);
       return Student.get().toDomain();
    }
    
    @Override
    public List<Student> findAll() {
       List<StudentJPO> students=studentStore.findAll();
       return students.stream().map(StudentJPO::toDomain).collect(Collectors.toList());
    }

    @Override
    public void delete(String id) {
        System.out.println();
    }

}
