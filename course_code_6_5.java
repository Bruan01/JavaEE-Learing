package course_code_six;
import java.util.Comparator;
import java.util.TreeSet;
//定义Teacher类实现Compareble接口

class Teacher implements Comparable{
    String name;
    int age;
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+":"+age;
    }
    public int compareTo(Object obj){//重写CompareTo接口的compareTo()方法
        Teacher s =(Teacher) obj;
        if(this.age-s.age < 0){
            return 1 ;
        }
        if(this.age-s.age==0){
            return this.name.compareTo(s.name);
        }
        return -1;
    }
}
public class course_code_6_5 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Teacher("jack",19));
        ts.add(new Teacher("jack1",1119));
        ts.add(new Teacher("jack2",129));
        ts.add(new Teacher("jack3",13));
        ts.add(new Teacher("jack4",22));
        System.out.println(ts);
    }
}
