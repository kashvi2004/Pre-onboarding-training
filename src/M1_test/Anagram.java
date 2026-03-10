package M1_test;

import java.util.*;

public class Anagram {
    public static boolean anagram(String str1,String str2){
        int[] freq=new int[256];
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<str2.length();i++){
            char ch1=str2.charAt(i);
            freq[ch1]--;
        }
        for(int i:freq){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        boolean check=anagram(str1,str2);
        if(check){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
