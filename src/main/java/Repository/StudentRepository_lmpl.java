package Repository;

import Object.ObjectClass.Student;

import java.util.List;

public interface StudentRepository_lmpl {
    public void create(Student student);
    public void update(Student student);
    public void delete(int id);
    public Student find(int id);
    public List<Student> findAll();

}
