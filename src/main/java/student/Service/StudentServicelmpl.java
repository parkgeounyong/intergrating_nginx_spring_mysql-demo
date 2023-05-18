package student.Service;

import student.object.Student;
import student.object.StudentCdo;
import student.object.StudentJpo;

public interface StudentServicelmpl {
    public void insert(StudentCdo studentCdo);
    public Student retriveService(Long id);
    public void modify(Long id, StudentCdo studentCdo);
    public void delete(Long id);
}
