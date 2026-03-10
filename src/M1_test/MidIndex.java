package M1_test;
import java.util.*;
public class MidIndex {
    public static int midIndex(int[] arr){
        Arrays.sort(arr);
        int mid=0;
        int j=0;
        while(j<arr.length && arr[j]<=0){
            j++;
        }
        mid=j+(arr.length-j)/2;
        return arr[mid];
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int result=midIndex(arr);
        System.out.println(result);
    }
}
