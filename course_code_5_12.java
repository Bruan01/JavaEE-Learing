package course_code.five;

public class course_code_5_12 {
    public static void main(String[] args) {
        int num = 123;
        //String的静态方法
        String string = String.valueOf(num);
        //num-->string
        System.out.println(string);
        String str = "998";
        //包装类的静态方法
        Integer integer = Integer.valueOf(num);
        Integer integer1 = Integer.valueOf(str);
        System.out.println(integer+ "////" + integer1);
        //包装类的有参构造方法
        Integer integer3 = new Integer(num);
        Integer integer4 = new Integer(str);
        System.out.println(integer3+"/////////////"+integer4);
        //包装类的parsexxx静态方法
        int parseInt = Integer.parseInt(str);
        System.out.println("将字符串转换为基本类型结果："+parseInt);
        //包装类的toString（）方法将包装类转化为字符串
        String string2 = integer.toString();//not static function
        System.out.println(string2);

    }
}
