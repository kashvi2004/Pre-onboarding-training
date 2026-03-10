package M1_test;
import java.util.*;
public class TiresomeWords {
    public static String modified(String str){
        StringBuilder sb=new StringBuilder();
        char first=' ';
        char last=' ';
        if(str.length()>10){
            for(int i=0;i<str.length();i++){
                first=str.charAt(0);
                last=str.charAt(str.length()-1);
            }
                sb.append(first);
                sb.append(str.length()-2);
                sb.append(last);



        }
        return sb.toString();
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String result=modified(str);
        System.out.println(result);
    }
}
