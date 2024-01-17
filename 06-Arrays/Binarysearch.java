import java.util.*;

public class Binarysearch {
  
  public static int binarySearch(int arr[] , int key) {
    int start = 0;
    int end = arr.length - 1;
    while(start < end){
      int mid = (start + end ) / 2;
      if(arr[mid] == key){
        return mid;
      }else if(arr[mid] > key){
         end = mid -1;
      }else{
        start = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    // input 
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the key");
    int key = sc.nextInt();

    int binarySearchAns = binarySearch(arr , key);
    
    if(binarySearchAns == -1){
      System.out.println("Element is not present ");
    }else{
      System.out.println("Element is present at " + binarySearchAns);
    }
  }
}
