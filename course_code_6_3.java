package course_code_six;

import java.util.ArrayList;
import java.util.Iterator;

public class course_code_6_3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Annie");
        list.add("Rose");
        list.add("Tom");
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if("Annie".equals(obj)){
                list.remove(obj);//iterator 不能用 remove 会报错
                break;// 加个break跳出循环就不会有异常
                //it.remove() 或者直接调用迭代器本身的删除方法
            }
        }
        System.out.println(list);
        System.out.println("--------------------------------------");
        ArrayList list1 = new ArrayList();
        list1.add("data_1");
        list1.add("data_2");
        list1.add("data_3");
        list1.add("data_4");
        list1.add("data_5");
        System.out.println(list);
        //jdk8 forEach
        list.forEach(obj->System.out.println("迭代元素："+obj));
        //jdk8 forEachRemaining
        Iterator it1 = list1.iterator();
        it1.forEachRemaining(obj->System.out.println("迭代元素： "+obj));
    }
}
