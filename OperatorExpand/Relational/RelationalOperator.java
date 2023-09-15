public class RelationalOperator{

    public static void main(String[] args) {
        int age = 18;  
        int i = 20;     
        //Using >= & <=
        if (age >= 18) {                      
            System.out.println("You are eligible to vote");
        }

        boolean x = i <= 18;
			System.out.println(x); 

        //Using != & ==
        int a  = 140;
		int b = 100;
		boolean f = a != b;
            System.out.println(f);
        boolean g = a == b;
            System.out.println(g);
        // Using < & >
         boolean s = a < b;
            System.out.println(s);
         boolean k = a > b;
            System.out.println(k);
    }



}