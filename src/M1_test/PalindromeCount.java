package M1_test;
import java.util.*;
public class PalindromeCount {
    public static int palindrome(String str){
        String[] words=str.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            String rev="";
            for(int j=words[i].length()-1;j>=0;j--){
                rev=rev+words[i].charAt(j);
            }
            if(words[i].equals(rev)){
                count++;
            }
        }
        return count;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int result= palindrome(str);
        System.out.println(result);
    }
}
