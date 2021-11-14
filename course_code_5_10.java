package course_code.five;
import java.io.IOException;
public class course_code_5_10 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();//获取Java程序关联的运行对象
        System.out.println("处理器个数："+rt.availableProcessors()+"个");
        System.out.println("空闲大小内存："+rt.freeMemory()/1024/1024 + "M");
        System.out.println("最大内存："+rt.maxMemory()/1024/1024 + "M");
    }
}
