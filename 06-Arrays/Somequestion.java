import java.util.*;

public class Somequestion {


  public static void largestElement(int arr[]) {
    // largest element
    
    int largestAns = arr[0];
    int smallestAns = arr[0];

    for(int i=1; i<arr.length; i++) {
      if(largestAns < arr[i]){
         largestAns = arr[i];
      }

      if(arr[i] < smallestAns){
          smallestAns = arr[i];
      }
    }

    System.out.println("Largest Element : " + largestAns);
    System.out.println("smallest Element : " + smallestAns);
  
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
    largestElement(arr);
  }
}
