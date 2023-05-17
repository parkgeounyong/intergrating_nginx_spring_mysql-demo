package Repository.JPA;

import Object.JPO.StudentJPO;
import Object.ObjectClass.Student;
import Repository.db_lmpl.StudentStore;
import Repository.studentRepository_lmpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class studentRepository_JPA implements studentRepository_lmpl {

    StudentStore studentStore;

    //DB 자동 연결
    public studentRepository_JPA(StudentStore studentStore){
        this.studentStore=studentStore;
    }
    //여기에서 DB에 저장할 대는 jpo 객체로 불러올 때는 도메인으로 변경 필요
    @Override
    public void create(Student student) {
        studentStore.save(student);
    }

    @Override
    public void update(Student student) {
        studentStore.save(student);
    }

    @Override
    public void delete(int id) {
        studentStore.delete(id);
    }

    @Override
    public Student find(int id) {
        Optional<StudentJPO> students=studentStore.findById(id);
        return students.get().toDomain();
    }
    
    @Override
    public List<Student> findAll() {
        List<StudentJPO> students=studentStore.findAll();
        return students.stream().map(StudentJPO::toDomain).collect(Collectors.toList());
    }
}
