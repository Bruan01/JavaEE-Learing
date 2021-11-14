package course_code.five;

import java.text.SimpleDateFormat;
import java.util.Date;

public class course_code_5_17 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年MM月dd日： 今天是yyyy年的第D天，E");
        System.out.println(sdf.format(new Date()));
    }
}
