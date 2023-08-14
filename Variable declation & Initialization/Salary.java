public class Salary{
    public static void main(String[] args) {
        Salary obj1 = new Salary();
        int hour = 5;
        int hourlySalary = 1000;
        int salary = obj1.calculateSalary(hour, hourlySalary);
        System.out.println("My age is:"+salary+".");

        
    }
    public int calculateSalary (int hour, int hourlySalary){
        return hourlySalary * hour;

    }
    

}
