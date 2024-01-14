import java.util.*;

public class DecToBin {

  public static int DecToBin(int num) {
    int ans = 0;
    int pow = 0;
    while(num > 0) {
      int bin = num%2;
      ans = ans + (int)(bin * (Math.pow(10,pow)));
      num = num/2;
      pow++;
    }
    return ans;
  }


  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int dec = sc.nextInt();
     int ans = DecToBin(dec);
     System.out.println("Decimal to Binary " + ans);
  }
}
