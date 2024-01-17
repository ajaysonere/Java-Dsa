import java.util.*;

public class LinearSearch {


  // linearSearch
  public static int linearSearch(int arr[]){
    Scanner sc  = new Scanner(System.in);
    int key = sc.nextInt();
     for(int i=0; i<arr.length; i++){
      if(arr[i] == key){
        return i;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];

    // input of an array
    for(int i=0; i<arr.length; i++){
       arr[i] = sc.nextInt();
    }

    int itemIndex = linearSearch(arr);

    if(itemIndex == -1){
      System.out.println("Element is not present");
    }else{
      System.out.println("Element is present at index " + itemIndex);
    }
  }
}
