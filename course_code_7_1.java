package course_code_selven;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class course_code_7_1 {
    public static void main(String[] args) throws Exception{
        Exm1();
        Exm2();
        Exm3();
        Exm4();
        Exm5();
        Exm6();
    }
    public static void Exm1() throws Exception{
        FileInputStream in = new FileInputStream("test.txt");
        int b = 0;
        while ((b = in.read()) != -1){
            System.out.println((char)b);
        }
        in.close();
    }
    public static void Exm2() throws Exception{

            FileOutputStream out = new FileOutputStream("out.txt", true);//可以追加
            //定义一个字符串
            String str = "hello";
            //将字符串转换为字节
        try {
            out.write(str.getBytes());//会帮你再转换一次的
            out.close();
        }
        finally{
                try {
                    if (out != null)
                        out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
    public static void Exm3() throws Exception{
        FileInputStream in = new FileInputStream("D:\\Java_code\\source\\微信图片_20210427195404.jpg");
        FileOutputStream out = new FileOutputStream("target\\dest.jpg");
        int len = 0;
        long beginTime = System.currentTimeMillis();
        try {
            while ((len = in.read()) != -1) {
                out.write(len);
            }
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        finally {
            in.close();
            out.close();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("花费时间： "+(endTime-beginTime)+"毫秒");
        in.close();
        out.close();
    }
    public static void Exm4() throws Exception{
        FileInputStream in = new FileInputStream("D:\\Java_code\\source\\微信图片_20210427195404.jpg");
        FileOutputStream out = new FileOutputStream("target/dest.jpg");
        int len = 0;
        byte[] buff = new byte[1024];
        long beginTime = System.currentTimeMillis();
        try{
            while ((len=in.read(buff))!=-1){
                out.write(buff,0,len);
            }
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        finally {
            in.close();
            out.close();
        }
        long EndTime = System.currentTimeMillis();
        System.out.println("花费的时间为： "+(EndTime-beginTime)+"毫秒");
        in.close();
        out.close();

    }
    public static void Exm5() throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Java_code\\source\\微信图片_20210427195404.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("target//dest.jpg"));
        int len = 0;
        long beginTime = System.currentTimeMillis();
        while((bis.read()) != -1){
            bos.write(len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("花费时间为："+(endTime-beginTime)+"毫秒");
        bis.close();
        bos.close();
    }
    public static void Exm6()throws Exception{
        FileReader fileReader = new FileReader("reader.txt");
        int len = 0;
        while((len = fileReader.read())!=-1){
            System.out.println((char)len);//字节返回...所以要加上(char)
        }
        fileReader.close();
    }

}
