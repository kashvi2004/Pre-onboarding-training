package M1_test;
import java.util.*;
public class DuplicatesFirst {
    public static int[] remove(int[] arr){
      Set<Integer> set=new LinkedHashSet<>();
      for(int i:arr){
          set.add(i);
      }
      int[] resultant=new int[set.size()];
      int k=0;
      for(int j:set){
          resultant[k++]=j;
      }
      return resultant;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(remove(arr)));
    }

}
