package M1_test;
import java.util.*;
public class isSubstring {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        boolean check=containsOrNot(str1,str2);
        if(check){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

    public static boolean containsOrNot(String str1, String str2) {

            if(str1.contains(str2)){
                return true;
            }
        return false;
    }
}
