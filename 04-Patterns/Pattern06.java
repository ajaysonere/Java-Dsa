import java.util.*;

public class Pattern06 {

  public static void printInvertedNum(int num) {
    for(int i=0; i<num; i++){
      for(int j=1; j<=num-i; j++){
        System.out.print(" " + j);
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     printInvertedNum(n);
  }
}
