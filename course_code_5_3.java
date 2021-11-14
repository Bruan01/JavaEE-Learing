package course_code.five;

public class course_code_5_3 {
    public static void main(String[] args){
        String str = "java";
        char[] charArray = str.toCharArray();
        System.out.println("string to charArray: ");
        for (int i=0;i<charArray.length;i++){
            if(i != charArray.length-1){
                System.out.println(charArray[i]+",");
            }
            else {
                System.out.println(charArray[i]);
            }
        }
        //静态函数
        System.out.println("将int值转换为String："+String.valueOf(12));
        System.out.println("将字符串小写转换成大写的结果："+str.toUpperCase());
    }
}
