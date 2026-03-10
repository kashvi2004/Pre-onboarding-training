package M1_test;
import java.util.*;

public class MaxOccuringCharacter {
    public static char maxOccuring(String s){
        int maxCount=0;
        char c=' ';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(ch==s.charAt(j)){
                    count++;
                }
            }
            if(maxCount<count){
                maxCount=count;
                c=s.charAt(i);
            }

        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(ch==s.charAt(j)){
                    count++;
                }
            }
            if(count==maxCount && ch!=c){
                return'0';
            }
        }
        return c;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char d=maxOccuring(s);
        System.out.println(d);
    }

}
