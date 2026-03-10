package M1_test;
import java.util.*;
public class AlphabetSequence {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String result=sequence(s);
        System.out.println(result);
    }

    public static String sequence(String s) {
        int n=s.length(),i=0;
        StringBuilder sb=new StringBuilder();
      while(i<n){
          int j=i;
          while(j<n && s.charAt(j)!='0'){
              j++;
          }
          sb.append((char) (j-i-1 +'A'));
          i=j+1;
      }
       return sb.toString();
    }
}
