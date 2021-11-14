package course_code.five;

public class course_code_5_2 {
    public static void main(String[] args){
        String s = "abcabcabcabcabca";
        System.out.println("字符串长度为："+s.length());
        System.out.println("字符串第一个字符L: "+s.charAt(0));
        System.out.println("字符c出现的第一次位置： "+s.indexOf('c'));//也可以是字符串
        System.out.println("子字符串最后一次出现的位置： "+s.lastIndexOf("ab"));
    }
}
