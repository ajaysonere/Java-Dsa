import  java.util.*;

public class PrimeNumInRange {
  
  public static boolean isPrime(int num) {
    if(num == 2 || num == 3) return true;
    for(int i=2; i<=Math.sqrt(num); i++){
       if(num%i == 0){
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end  = sc.nextInt();
    
    for(int i=start; i<= end; i++){
      if(isPrime(i)){
        System.out.print(" " + i);
      }
    }

  }
}
