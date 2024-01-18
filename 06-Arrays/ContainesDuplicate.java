import java.util.*;

public class ContainesDuplicate {
  
  public static boolean isContainesDuplicate(int arr[]) {
    for(int i=0; i<arr.length-1; i++){
      for(int j = i+1; j<arr.length; j++){
        System.out.println("i " + arr[i] + " j " + arr[j]);
        if(arr[i] == arr[j]){
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    
    boolean containesDuplicateAns = isContainesDuplicate(arr);
    System.out.println(containesDuplicateAns);
    if(containesDuplicateAns == true){
      System.out.println("Duplicate present");
    }else{
      System.out.println("Duplicate not present");
    }
  }
}
