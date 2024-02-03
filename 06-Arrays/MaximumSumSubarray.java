import java.util.*;

public class MaximumSumSubarray {

   public static int maximumSubArraySum(int arr[]){
      int ans = Integer.MIN_VALUE;
      for(int i=0; i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
           int temp = 0;
           for(int k=i; k<=j ; k++){
              temp += arr[k];
           }
           if(temp > ans){
              ans  = temp;
           }
        }
      }
      return ans;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<arr.length; i++){
         arr[i] = sc.nextInt();
      }
      int ans = maximumSubArraySum(arr);
      System.out.println("Max Subarray will be " + ans);
   }
}