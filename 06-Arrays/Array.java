import  java.util.*;

public class Array {


  // update Array
  public static void update(int arr[]) {
    for(int i=0; i<arr.length; i++){
      arr[i] = arr[i]+1;
    }
  }

   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    for(int i=0; i<arr.length; i++){
       arr[i] = sc.nextInt();
    }

    // print Array
    for(int i=0; i<arr.length; i++){
       System.out.print(arr[i] + " ");
    }
    System.out.println();

    update(arr);

    // print updated Array
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
