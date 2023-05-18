package student.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentCdo {
    public Long id;
    public String name;
    public StudentCdo(Long id, String name){
        this.id=id;
        this.name=name;
    }
    public StudentJpo toJpo(){
        return new StudentJpo(this.id, this.name);
    }
    public Student toDomain(){
        return new Student(this.id, this.name);
    }
}
