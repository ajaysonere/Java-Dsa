import java.util.*;

public class Factorial {
     
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
       
          if(n == 0){
              System.out.println("Factorial is 1");
              return ;
          }

          long fac = 1;

          while(n>1){
               fac *= n;
               n--;
          }

          System.out.println("Factorial is " + fac);
     }
}
