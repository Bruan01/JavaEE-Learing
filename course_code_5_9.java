package course_code.five;

public class course_code_5_9 {
    public static void main(String[] args) {
        int[] srcArray = {100,102,103,104,105,106};
        int[] destArray = {201,202,203,204,205};
        System.arraycopy(srcArray,2,destArray,0,4);
        for(int i = 0;i<destArray.length;i++){
            System.out.println(i+":"+destArray[i]);
        }
        System.gc();//清理垃圾
    }
}
