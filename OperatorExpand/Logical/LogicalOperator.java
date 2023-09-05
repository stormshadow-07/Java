public class LogicalOperator{
    public static void main(String[] args) {
        int a = 120; 
        int b = 100;
        int c = 90;

        boolean f = (c >= a && c <= b);              
            System.out.println(f);   

        boolean d = (c <= a || c <= b);
            System.out.println(d);
    }
}