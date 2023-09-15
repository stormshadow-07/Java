import java.util.Scanner;

public class DeterminateTwoNumbersAreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of x:");
        int a = sc.nextInt();
        System.out.print("Enter the number of y:");
        int b = sc.nextInt();
        if((a ^ b)== 0){
            System.out.println("The numbers are Equal.");
        }
        else{
            System.out.println("The numbers are Not-Equal.");
        }
    }
}