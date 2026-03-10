package M1_test;
import java.util.*;
public class UpperOrLower {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        upOrLow(str);
    }
    public static void upOrLow(String str){
        int countUpper=0;
        int countLower=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                countUpper++;
            }
            else{
                countLower++;
            }
        }
        if(countUpper>countLower){
            System.out.println("Convert all to UpperCase");
        }
        else{
            System.out.println("Convert all to LowerCase");
        }
    }
}
