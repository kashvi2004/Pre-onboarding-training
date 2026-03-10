package M1_test;
import java.util.*;
public class RepeatString {
    public static String repetition(String s, int n) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.append(s);
        }
        return sb.toString();
    }

    static void main() {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        String result=repetition(s,n);
        System.out.println(result);
    }


}
