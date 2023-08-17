public class IfElse_IfElse_Statement {
    


    public static void main(String[] args) {
        int marks = 80;
        if (marks > 100 || marks < 0){
            System.out.println("Invalid marks!");
        }
        if (marks >= 80){
            System.out.println("A+");
        }
        else if (marks >= 70){
            System.out.println("A");
        }
        else if (marks >= 60){
            System.out.println("A-");
        }
        else if (marks >= 50){
            System.out.println("B");
        }
        else if (marks >= 40){
            System.out.println("c");
        }
        else if (marks >= 30){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        System.out.println("Exiting...");
    }   

}