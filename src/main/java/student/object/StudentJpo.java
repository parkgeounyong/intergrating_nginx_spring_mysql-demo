package student.object;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="TEST")
public class StudentJpo {
    @Id
    private Long id;
    private String name;

    //domain > Jpo
    public StudentJpo(Student student){
        BeanUtils.copyProperties(student, this);
    }
    public StudentJpo(Long id, String name){
        this.id=id;
        this.name=name;

    }
    //jpo>domiain
    public Student toDomain(){
        return new Student(this.id, this.name);
    }

}
