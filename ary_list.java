package work;
import java.io.File;
public class ary_list {
    public static void main(String[] args) throws  Exception{
        File file = new File("D:\\Java_code");
        listFile(file,"");
    }
    public static void listFile(File dir,String spance)throws  Exception{
        File[] files = dir.listFiles();
        for (File file:files){
            if(file.isFile()){
                System.out.println(spance+file.getName());

            }
            else if(file.isDirectory()){
                System.out.println(spance+file.getName());
                listFile(file," |-- "+spance);
            }
        }
    }
}
