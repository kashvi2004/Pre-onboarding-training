package M1_test;
import java.util.*;
public class RemoveDuplicates {
    public static String remove(String str){
        String result="";
       int[] freq=new int[256];
       for(int i=0;i<str.length();i++){
           if(freq[str.charAt(i)]==0){
               freq[str.charAt(i)]++;
               result+=str.charAt(i);
           }
       }
       return result;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(remove(str));
    }
}
