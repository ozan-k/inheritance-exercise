public class Main{
    public static void main(String[] args){
        Vehicle v = new Vehicle("CM756XB");
        System.out.println(v.getLicensePlate());
        System.out.println("~~~~~~~~~~~~~~~");
        Car c = new Car("CM756XB",4);
        c.setLicensePlate("CM756Xb");
        System.out.println(c.getLicensePlate());
    }
}
