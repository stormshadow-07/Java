public class Address{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Address obj1 = new Address();
        String address = obj1.getAddress();
        System.out.println("I am from "+address+".");

    }
    public String getAddress(){
        return "Rajshahi,Bogura";
    }

}