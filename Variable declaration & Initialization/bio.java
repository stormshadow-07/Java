public class bio {

    public static void main(String[] args) {
        bio obj1 = new bio();
        String name = obj1.getName();
        int age = obj1.getAge();
        String address = obj1.getAddress();
        int hour = 6;
        int hourlySalary = 1000;
        int salary = obj1.calculateSalary(hour,hourlySalary);

        System.out.println("Hi there.I'm " + name + "." );
        System.out.println("I'm  " + age + "years old" );
        System.out.println("My address is " + address + "." );
        System.out.println("My salary is " + salary + "." );
    }
    public String getName(){
        return "Abrar Zahin";
    }
    public String getAddress(){
        return "Rajshahi,Bogura";
    }
    public int getAge(){

        return 1;
    }
    public int calculateSalary(int hour,int houlrlySalary){

    return houlrlySalary*hour ;
    }

}