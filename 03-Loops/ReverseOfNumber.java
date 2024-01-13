import java.util.*;

public class ReverseOfNumber {
     public static void main(String args[]) {
          
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number = 0;
        while(n > 0 ){
          int temp = n%10;
          number = number*10 + temp;
          n = n/10;
        }

        System.out.println("Reverse of Number is : " + number);
    }
}
