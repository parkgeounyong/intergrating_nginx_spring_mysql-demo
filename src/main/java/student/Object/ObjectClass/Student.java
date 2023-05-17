package student.Object.ObjectClass;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    //student id
    private String id;
    //student name
    private String name;
    //student subject grade

    //생성자
    public Student(){
        //해당 클래스에서 super 사용 이유 > 초기화
    }
    public Student(String id, String name){
        this.id=id;
        this.name=name;
    }

    //클래스 JSON 형식으로 출력
    public static Student sample() {
        //
        Student student = new Student("2019113328", "박근용");
        return student;
    }

    public static void main(String[] args) {
        System.out.println(new Gson().toJson(sample()));
    }
}
