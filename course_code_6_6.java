package course_code_six;
import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2 ){
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        int temp = s1.length() - s2.length();
        return temp;
    }
}
public class course_code_6_6 {
    public static void main(String[] args) {
        //1.创建集合时，传入Comparator接口定制排序顺序
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add("Jack");
        ts.add("Helena");
        ts.add("Eva");
        System.out.println(ts);
        //2.使用lambda表达式
        TreeSet ts2 = new TreeSet((obj1,obj2)->{
            String s1 = (String) obj1;
            String s2 = (String) obj2;
            return s1.length() - s2.length();
        });
        ts2.add("Jack");
        ts2.add("Jack1");
        ts2.add("Jack2");
        ts2.add("Jack3");
        ts2.add("Jack4");
        System.out.println(ts2);
    }
}
