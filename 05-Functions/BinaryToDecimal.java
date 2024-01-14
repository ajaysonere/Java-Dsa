import java.util.*;

public class BinaryToDecimal {
 
  public static int bToDec(int binaryForm) {
    int ans  = 0;
    int index = 1;
    while(binaryForm > 0) {
      int lastDigit = binaryForm%10;
      ans = ans + index * lastDigit;
      binaryForm /= 10;
      index = index*2;
    }

    return ans;

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int binaryForm = sc.nextInt();
    int ans = bToDec(binaryForm);
    System.out.println("Binary to Decimal " + ans);
  }
}
