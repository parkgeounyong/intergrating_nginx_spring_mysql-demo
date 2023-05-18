package student.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;

    public Student(StudentCdo studentCdo){
        this.id=studentCdo.getId();
        this.name=studentCdo.getName();
    }
    public Student(Long id, String name){
        this.id=id;
        this.name=name;
    }
    public StudentCdo toCdo(){
        StudentCdo studentCdo=new StudentCdo(this.id, this.name);
        return studentCdo;
    }
    public StudentJpo toJpo(){
        StudentJpo studentJpo=new StudentJpo(this.id, this.name);
        return studentJpo;
    }
}
