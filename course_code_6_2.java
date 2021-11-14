package course_code_six;

import java.util.ArrayList;
import java.util.Iterator;

public class course_code_6_2 {
    public static void main(String[] args) {
        //Iterator
        ArrayList list = new ArrayList();
        list.add("data_1");
        list.add("data_2");
        list.add("data_3");
        list.add("data_4");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
        System.out.println("---------------------------------");
        //foreach
        ArrayList list1 = new ArrayList();
        list1.add("data_1");
        list1.add("data_2");
        list1.add("data_3");
        list1.add("data_4");
        for(Object obj :list1){
            System.out.println(obj);
        }
        //foreach不能对元素进行修改
        String[] strs = {"aaa","bbb","ccc"};
        for (String str :strs){
            System.out.println(":"+str);
            str = "ddd";//用临时变量str 指向一个 新字符串
        }
        System.out.println("foreach 循环修改后的数组: " + strs[0] + "," + strs[1] + "," + strs[2]);
        //for循环遍历数组
        for (int i = 0;i<strs.length;i++){
            strs[i] = "ddd";
        }
        System.out.println("for 循环修改后的数组: " + strs[0] + "," + strs[1] + "," + strs[2]);

    }
}
