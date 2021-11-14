package course_code.five;
import java.util.*;

public class course_code_5_1 {
    public static void main(String[] args){
        //也可 String s = “sads”
        String str1 = new String();
        String str2 = new String("abc");
        char[] charArray = new char[]{'A','B','C'};
        //传入字符数组
        String str3 = new String(charArray);
        System.out.println("a"+str1+"b");
        System.out.println(str2);
        System.out.println(str3);
    }
}
