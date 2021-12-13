package inheritance;

public abstract class Car extends Vehicle{

    int numDoors;
    int maxSpeed;

    public Car(int numDoors, int maxSpeed){
        super(maxSpeed);
        System.out.println("Car's constructor");
        this.numDoors = numDoors;
    }

    public Car(){
        System.out.println("Car's constructor");
    }

    public void print(){
        // super.print();
        System.out.println("Car" + " numDoors " + numDoors);
    }

    public void printMaxSpeed(){
        super.maxSpeed = maxSpeed;
        System.out.println(maxSpeed + super.maxSpeed);
    }

    @Override
    public boolean isMotorized() {
        return true;
    }
}
