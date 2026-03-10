package M1_test;
import java.util.*;
public class ZeroesToEnd {
    public static int[] push(int[] arr){
       int n=arr.length;
        int pos=0;
        int i=0;
        while(i<n){
            if(arr[i]!=0){
              arr[pos]=arr[i];
                pos++;
            }
            i++;
        }
        while(pos<n){
            arr[pos++]=0;
        }
        return arr;
    }
    static void main() {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println(Arrays.toString(push(arr)));
    }
}
