package student.Store.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import student.object.StudentJpo;

import java.util.Optional;

public interface StudentStoreJpa extends JpaRepository<StudentJpo, Long> {
}
