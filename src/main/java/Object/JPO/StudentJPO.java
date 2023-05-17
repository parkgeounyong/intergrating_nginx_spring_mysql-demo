package Object.JPO;

import Object.ObjectClass.Student;
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
@Table(name="TRAVEL_CLUB")
public class StudentJPO {

    @Id
    private int id;
    //student name
    private String name;

    public StudentJPO(Student student){
        //속성 이름 같을 때 대응되는 속성으로 업데이트
        BeanUtils.copyProperties(student, this);
    }
    public Student toDomain(){
        Student student=new Student(this.id, this.name);
        return  student;
    }
}
