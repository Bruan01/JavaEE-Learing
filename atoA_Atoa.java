package work;

import java.util.Locale;

public class atoA_Atoa {
    public static void main(String[] args){
        String s1 = "HelloWorld";
        StringBuffer s4 = new StringBuffer();
        char[] s2 = s1.toCharArray();
        for(int i = s2.length-1;i>=0;i--){
            if(s2[i] >= 'a'&& s2[i]<='z'){
                char[] s3 = s1.toUpperCase().toCharArray();
                s4.append(s3[i]);
            }
            if(s2[i] >= 'A'&&s2[i] <='Z'){
                char[] s3 = s1.toLowerCase().toCharArray();
                s4.append(s3[i]);
            }
        }
        System.out.println(s4.toString());
    }

}
