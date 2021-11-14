package course_code.five;

public class course_code_5_7 {
    public static void main(String[] args) {
        System.out.println("添加---------------------------");
        add();
        System.out.println("修改---------------------------");
        update();
        System.out.println("删除---------------------------");
        delete();
    }
    public  static void  add(){
        StringBuffer sb = new StringBuffer();
        sb.append("ABC");
        System.out.println("append添加结果： "+sb);
        sb.insert(3,"DE");

    }
    public static void update(){
        StringBuffer sb = new StringBuffer("AAABBB");
        sb.setCharAt(2,'F');//修改指定字符
        System.out.println("修改指定位置字符结果： "+sb);
        sb.replace(3,5,"spp");//替换指定位置字符串或字符
        System.out.println("res:"+sb);
        System.out.println("字符串翻转结果： "+sb.reverse());
    }
    public static void delete(){
        StringBuffer sb = new StringBuffer("ABCDEFG");
        sb.delete(3,7);//范围
        System.out.println("删除指定位置结果"+sb);
        sb.deleteCharAt(2);//具体
        System.out.println(sb);
        sb.delete(0,sb.length());//清空缓存区()一整个清掉
        System.out.println(sb);
    }
}
