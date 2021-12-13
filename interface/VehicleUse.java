package Interface;

public class VehicleUse {
    public static void main(String[] args) {

        Car c = new Car();
        System.out.println(c.getCompany() + " " + c.numGears() + " " + c.isMotorized());
        c.print();
        System.out.println();
        
        // Vehicle v = new Vehicle();
        // VehicleInterface v1;
        // v.print();
    }
    
}
