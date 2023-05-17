package StudentServer;

import Object.ObjectClass.Student;
import Repository.JPA.studentRepository_JPA;
import Repository.db_lmpl.StudentStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class);
    }
}
