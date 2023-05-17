package student;

import student.Repository.JPA.StudentRepository_JPA;
import student.Repository.StudentRepository_lmpl;
import student.Repository.db_lmpl.StudentStore;
import student.Service.StudentService_lmpl;
import student.Service.logic.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {
    @Bean
    public StudentRepository_JPA studentRepository_JPA(){
        return new StudentRepository_JPA(studentStore());
    }

    @Bean
    public StudentStore studentStore() {
        // studentStore 객체를 생성하여 반환하는 로직을 구현해야 합니다.
        return new StudentStore();
    }

    @Bean
    public StudentService_lmpl studentService_lmpl(){
        StudentService studentService=new StudentService();
        studentService.setStudentRepository_lmpl(studentRepository_JPA());
        return studentService;
    }
}
