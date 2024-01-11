import java.util.*;

public class PrimeNumber {

     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int check = 2;
          boolean isPrime = true;
          while(check < n){
              if(n%check == 0){
                   isPrime = false;
                   break;
              }
              check++;
          }

          if(isPrime == false) {
               System.out.println("Number is not Prime ");
          }else {
               System.out.println("Number is Prime");
          }
     }
}
