package inheritance;

public abstract class Vehicle {
    
    private String color;
    protected int maxSpeed;

    public Vehicle(int maxSpeed){
        System.out.println("Vehicle's constructor");
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(){
        System.out.println("Vehicle's constructor");
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void print(){
        System.out.println("Vehicle " + "color " + color + " maxspeed " + maxSpeed);
    }

    public abstract boolean isMotorized();

    public abstract String getCompany();
}
