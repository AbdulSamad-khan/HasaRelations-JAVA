import java.util.List;
import java.util.ArrayList;

//one to many is likely to be an Aggregation..
public class Test{
    public static void main(String[] args){
        Courses c1 = new Courses("English");
        Courses c2 = new Courses("Math");
        List <Courses>courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        Teacher teach = new Teacher(courses,"Abdul Samad","bs computer Science");
        teach.print();
        teach.anotherWay();
        System.out.println("Checking the effect of fork");
    }
}

class Teacher{
    //teacher has multiple courses..
    List<Courses> course;
    public String name;
    public String qualification;

    Teacher(List <Courses> course,String name, String qualification){
        this.course = course;
        this.name = name;
        this.qualification = qualification;
    }

    public void print(){
      //whenever we print object it gets to string method..
      for(Courses obj : course){
          System.out.println(obj.name);
      }
    }
    public String getClassName(){
        return  getClass().getName();
    }
    public void anotherWay(){
        for(int i = 0;i<this.course.size();i++){
            System.out.println(this.course.get(i).name);
        }

    }
}

class Courses{
    public String name;
    Courses(String name){
        this.name=name;
    }
}
