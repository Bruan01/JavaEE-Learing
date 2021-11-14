package course_code.five;

import java.util.Calendar;

public class course_code_5_14 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//运用静态方法来得到一个对象
        int year = calendar.get(Calendar.YEAR);
        int date = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH);
        calendar.set(2100,2,2);
        //hour
        //minute
        //second
        //开启非容错模式
        calendar.setLenient(false);
        System.out.println("time :"+year+":"+month+":"+date);
    }
}
