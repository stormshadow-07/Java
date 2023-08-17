public class UsingConstants{


    private final int RESSULT_CLASS10 = 90;   //When a variable is declared as final, its value cannot be changed once it has been initialized.
                                             //Final variables should be fully capitalized.
    public void getResult(){
        System.out.println("The Result is : " + RESSULT_CLASS10);
    }

    public static void main(String[] args) {
        UsingConstants obj = new UsingConstants();
        obj.getResult();
        
    }

}


