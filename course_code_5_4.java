package course_code.five;

public class course_code_5_4 {
    public static void main(String[] args) {
    //去除空格
        String s = "  http :// localhost : 8080           2";
        System.out.println(s);
        System.out.println(s.trim());//两端
        System.out.println(s.replace(" ",""));
    }
}
