
import java.util.Scanner;

public class Product{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println("Product is "+ x*y );
        
        sc.close();
    }
}