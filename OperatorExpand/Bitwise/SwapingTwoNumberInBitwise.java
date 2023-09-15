import java.util.Scanner;

public class SwapingTwoNumberInBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of X:");
        int a = sc.nextInt();
        System.out.print("Enter the value of Y:");
        int b = sc.nextInt();
        
        a =(a ^ b);
        b =(a ^ b);
        a =(a ^ b);
        
        System.out.println("Now Value of a: " + a);
        System.out.println("Now Value of b: " + b);
        
    }
}