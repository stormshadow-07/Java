public class BreakStatement {
    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i <= 100; i++){
            System.out.println("i" + i);
            if (i == 60){
                break;
            }
        }
        System.out.println("After loop  'i' = " + i);
    }
}
