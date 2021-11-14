package course_code_six;

import java.util.ArrayList;
import java.util.LinkedList;

public class course_code_6_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("stu1");
        list.add("stu2");
        list.add("stu3");
        list.add("stu4");
        System.out.println("list.size(): "+list.size());
        System.out.println("第二个元素是： "+list.get(1));
        //--------------------------------------------
        System.out.println("-----------------------------------------");
        LinkedList link = new LinkedList();
        link.add("stu1");
        link.add("stu2");
        System.out.println(link);
        link.offer("offer");//向尾部添加元素
        link.push("head");//向头部添加元素
        //获取元素
        Object object = link.peek();//获取第一个元素
        System.out.println(object);
        System.out.println(link);
        //删除元素
        link.removeFirst();
        link.removeLast();
        System.out.println(link);

    }
}
