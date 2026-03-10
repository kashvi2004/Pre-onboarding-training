package M1_test;
import java.util.*;
public class HikeTrial {
    public static int peak(int[] arr,int n) {
        int num = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                num = arr[i];
            }
        }
        return num;

    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=peak(arr,n);
        System.out.println(result);
    }
}

