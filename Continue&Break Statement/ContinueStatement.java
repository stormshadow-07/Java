
public class ContinueStatement {
    public static void main(String[] args) {
        int i = 0;
        for(i =1 ; i <= 100; i++) {
        if(i % 2 == 0){
        continue;
        }
            System.out.println(i);
        }
    }
}