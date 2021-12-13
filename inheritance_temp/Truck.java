package inheritance_temp;

import inheritance.Vehicle;

public class Truck extends Vehicle{

    int maxLoadingCapacity;

    public Truck(){
        super(23);
    }
    
    public void print(){
        System.out.println("Vehicle " + "color " + getColor() + " maxLoadingCapacity " + maxLoadingCapacity + " maxspeed " + maxSpeed );
    }

    @Override
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String getCompany() {
        return null;
    }
}
