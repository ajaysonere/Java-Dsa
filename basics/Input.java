package basics;

import java.util.Scanner;

public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);
        String str = sc.nextLine();
        System.out.println("Hello"+ str);
        sc.close();
    }
}
