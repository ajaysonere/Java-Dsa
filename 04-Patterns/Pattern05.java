import java.util.*;

public class Pattern05 {

  public static void printInverted(int n) {
    for(int i=0; i<n;i++){
      for(int j=0;j<n;j++){
         if(j >= n-i-1){
          System.out.print("*");
        }else{
          System.out.print("_");
        }
      }
      System.out.println();
    }
  }

  public static void main(String args []) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printInverted(n);
  }
}
