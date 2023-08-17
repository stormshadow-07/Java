public class Static_NonStatic{



    private String address;

    public void getPresentAddress(){
        address = "Dhaka,Bangladesh";
        System.out.println("Present Address:"+ address);
    }

    public void getParmanentAddress(){
        address = "Bogura,Bangladesh";
        System.out.println("Parmanent Address: " + address);
    }
    
    public static void main(String[] args) {
        Static_NonStatic obj = new Static_NonStatic();
        obj.getParmanentAddress();
        obj.getPresentAddress();
        
    }


}