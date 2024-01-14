import java.util.*;

public class Binomial {

   public static int factorial(int n){
    int ans  = 1;
    while(n >=1){
      ans *= n--;
    }

    System.out.println(ans);
    return ans;
   }

   public static void main(String args []) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    int ans = (factorial(n) /(factorial(r) * factorial(n-r)));
    System.out.println("Binomial is " + ans);
  }
}
