import java.util.*;

public class Foverloading {
  
  public static int addition(int a , int b) {
    return a+b;
  }

  public static int addition(int a , int b ,int c) {
     return a+b+c;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // addition of two numbers
    System.out.println("Addition of Two Numbers " + addition(a ,b));

    // addition of three numbers
    
    System.out.println("Addition of three Numbers " + addition(a , b, c));
  }
}
