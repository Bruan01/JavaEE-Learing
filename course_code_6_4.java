package course_code_six;
import java.util.*;
class Student{
    String id;
    String name;
    public Student(String id , String name){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return id + ":::::"+name;
    }
    public int hashCode(){
        return id.hashCode();//返回id属性的哈希值
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Student)){
            return false;
        }
        Student stu = (Student) obj;
        boolean b = this.id.equals(stu.id);
        return b;
    }

}
public class course_code_6_4 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student s1 = new Student("1","jack");
        Student s2 = new Student("2","jack1");
        Student s3 = new Student("2","jack1");
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);


    }
}
