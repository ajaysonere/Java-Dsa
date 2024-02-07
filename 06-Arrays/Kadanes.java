import java.util.*;

public class Kadanes {

    public static int kadanesAlgo(int arr[]) {
       int currentSum = 0;
       int maximumSum = Integer.MIN_VALUE;
       
       for(int i=0; i<arr.length; i++){
          if(currentSum < 0){
             currentSum = 0;
          }
          
          currentSum += arr[i];
          
          if(currentSum > maximumSum) {
             maximumSum = currentSum;
          }
       }
       
       return maximumSum;
    }

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       
       for(int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }
       
       int ans = kadanesAlgo(arr);
       
       System.out.println("Sub array sum is: " + ans);
       
    }
}
