package student.Service;

import student.Object.ObjectClass.Student;

import java.util.List;

public interface StudentService_lmpl {
    public void create(Student student);
    public void update(Student student);
    public void delete(String id);
    public Student find(String id);
    public List<Student> findAll();
}
