
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       float radius = sc.nextFloat();
       float AreaOfCircle = 3.14f*radius*radius;
       System.out.println(AreaOfCircle);
       sc.close();
    }
}
