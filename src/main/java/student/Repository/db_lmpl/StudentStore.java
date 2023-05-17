package student.Repository.db_lmpl;

import org.springframework.data.jpa.repository.JpaRepository;
import student.Object.JPO.StudentJPO;
import student.Object.ObjectClass.Student;


public interface StudentStore extends JpaRepository<StudentJPO, String> {//쿼리 작성
}
