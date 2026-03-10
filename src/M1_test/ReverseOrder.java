package M1_test;
import java.util.*;
public class ReverseOrder {
    public static int reverse(int n){
        int temp=n;
        int rev=0;
        while (temp> 0) {
            rev=rev*10+temp%10;
            temp=temp/10;

        }
        return rev;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=reverse(n);
        System.out.println(result);
    }
}
