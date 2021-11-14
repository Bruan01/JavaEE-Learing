package course_code.five;
import java.util.*;
public class course_code_5_8 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties);
        //获取key 返回set对象
        Set<String> propertyNames = properties.stringPropertyNames();//返回set对象集
        for (String key:propertyNames){
            String value = System.getProperty(key);
            System.out.println(key+"------------"+value);
        }

        //...............................
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0;i < 1012221110;i++){
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间："+(endTime-startTime)+"毫秒");
    }
}
