package inheritance;

public abstract class Bicycle extends Vehicle {
    
    public Bicycle(){
        super(100);
    }

    @Override
    public boolean isMotorized() {
        return false;
    }
}
