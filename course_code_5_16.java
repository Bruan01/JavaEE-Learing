package course_code.five;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class course_code_5_16 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        //FULL 类型格式化对象
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
        //long 类型格式化对象
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        //medium 类型格式化对象
        DateFormat mediumFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        //SHORT ..
        System.out.println("完整格式："+fullFormat.format(date));
        System.out.println("长格式: "+longFormat.format(date));
        System.out.println("普通格式： "+mediumFormat.format(date));
        //parse的使用
        String str1 = "2018-1-1";
        System.out.println(mediumFormat.parse(str1));

    }
}
