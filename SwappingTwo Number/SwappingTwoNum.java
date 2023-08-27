public class SwappingTwoNum{

    public static void main(String[] args) {
        int a = 20;
        int b = 15;

        swap(a, b);
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);



    }
}