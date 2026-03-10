package M1_test;
import java.util.*;
public class CaeserCipher {
    public static String replace(String str){
        StringBuilder res=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='x'){
                res.append('a');
            }
            else if(ch=='y'){
                res.append('b');
            }
            else if(ch=='z'){
                res.append('c');
            }
            else{
                res.append((char) (ch+3));
            }


        }
        return res.toString();
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(replace(str));
    }
}
