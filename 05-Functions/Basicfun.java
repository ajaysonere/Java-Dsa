import java.util.*;

public class Basicfun {
  public static int addition(int a , int b){
    return a+b;
  }


  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Addition of Two Numbers " + addition(a,b));
  }
}
