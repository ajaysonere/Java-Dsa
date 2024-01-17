import java.util.*;

public class Somequestion {


  public static int largestElement(int arr[]) {
    // largest element
    
    int ans = arr[0];
    for(int i=1; i<arr.length; i++) {
      if(ans < arr[i]){
         ans = arr[i];
      }
    }
    return ans;
  }

  public static void main(String args []) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    
    // input array
    for(int i=0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    // largest element in array
    int largestElementAns = largestElement(arr);
    System.out.println("Largest Element " + largestElementAns);
  }
}
