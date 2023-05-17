package student.Store;

import student.object.Student;
import student.object.StudentCdo;
import student.object.StudentJpo;

public interface StudentStoreLmpl {
    //crud
    public void insert(StudentJpo studentJpo);
    public Student retriveStore(Long id);
}
