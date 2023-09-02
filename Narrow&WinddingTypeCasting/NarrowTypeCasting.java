public class NarrowTypeCasting {

    public static void main(String[] args) {
        int i = 10000;
        short s = (short)i;
        byte b = (byte)i;
        

        System.out.println("Binary representation of num: " + Integer.toBinaryString(i));
        System.out.println("|");
        System.out.println("Value: " + i);
        System.out.println("Value: " + s);
        System.out.println("Value: " + b);
    }
}