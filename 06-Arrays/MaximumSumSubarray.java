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
   
   public static int prefixMethod(int arr[]){
      int ans = Integer.MIN_VALUE;
      int prefix[] = new int[arr.length];
      prefix[0] = arr[0];
      
      for(int i=1; i<arr.length; i++){
         prefix[i] = arr[i]+prefix[i-1];
      }
      
      for(int i=0; i<arr.length; i++){
           for(int j=i; j<arr.length; j++){
               int temp = i==0 ? prefix[j] : prefix[j]- prefix[i-1];
               if(temp > ans){
                  ans = temp;
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
      int ans = prefixMethod(arr);
      System.out.println("Max Subarray will be " + ans);
   }
}