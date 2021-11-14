package course_code.five;
import java.util.Date;

public class course_code_5_13 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis() + 1000);//1s后的时间
        System.out.println(date1);
        System.out.println(date2);
    }
}
