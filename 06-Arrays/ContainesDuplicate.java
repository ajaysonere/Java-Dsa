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

  public static boolean ContainesDuplicateUsingSet(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    for(int i=0; i<arr.length; i++){
      set.add(arr[i]);
    }

    // size are different
    if(set.size() == arr.length){
      return false;
    }

    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    
    boolean containesDuplicateAns = ContainesDuplicateUsingSet(arr);
    System.out.println(containesDuplicateAns);
    if(containesDuplicateAns == true){
      System.out.println("Duplicate present");
    }else{
      System.out.println("Duplicate not present");
    }
  }
}
