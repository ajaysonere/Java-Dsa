import java.util.*;

public class Loops{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int i=1;
       while(i<=n){
         System.out.print(i + " ");
         i++;
       }
       
       System.out.println();
       
       for(i=n; i>0 ; i--){
          System.out.print(i + " ");
       }
       
       System.out.println();
       
       sc.close();
    }
}