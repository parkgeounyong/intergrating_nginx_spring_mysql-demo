package student.Store;

import student.object.Student;
import student.object.StudentCdo;
import student.object.StudentJpo;

public interface StudentStoreLmpl {
    //crud
    public void insert(StudentJpo studentJpo);
    public Student retriveStore(Long id);
    public void modify(Long id, Student student);
    public void delete(Long id);
}
