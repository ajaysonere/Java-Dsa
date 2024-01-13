import java.util.*;

public class Practice {

  public static int averageOfThree() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int ans = (a+b+c)/3;
    return ans;
  }

  public static boolean isEven() {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     return a%2==0;
  }

  public static boolean isPalindrom() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int check = a; // for later comparing with ans;
    int number = 0;
    while(a > 0){
      int temp = a%10;
      number  = number*10 + temp;
      a  = a/10;
    }
    if(check == number) return true;
    return false;
  }

  public static void sumOfDigitsInNumber() {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int sum = 0;
    while(number > 0) {
      sum += number%10;
      number /= 10;
    }
    System.out.println("Number is " + number + "Sum of Digits are " + sum);
  }

  public static void main(String args []) {
    Scanner sc = new Scanner(System.in);

    // Average of three numbers
    System.out.println("Enter for Average");
    int averageOfAns = averageOfThree();
    System.out.println("Average of Three " + averageOfAns);
    
    // is number is even or odd
    System.out.println("Enter for Even");
    if(isEven() == true){
      System.out.println("Number is Even");
    }else{
      System.out.println("Number is odd");
    }

    // isPalindrom
    System.out.println("Enter for is Palindrom");
    if(isPalindrom() == true){
      System.out.println("Palindrom");
    }else{
      System.out.println("Not Palindrom");
    }

    // sumOfDigitsInNumber
    System.out.println("Enter for sumOfDigitsInNumber");
    sumOfDigitsInNumber();

  }
}
