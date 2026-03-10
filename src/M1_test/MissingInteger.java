package M1_test;
import java.util.*;
public class MissingInteger {
    public static int missing(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result=missing(arr);
        System.out.println(result);
    }
}
