package oops;

public class Student {
    
    String name;
    private int rollNumber;   // accessible within same class
    // default will be accessible within same package
    double cgpa;
    public final static double CONVERSIONFACTOR = 0.95;
    private static int numStudents;

    //Constructor
    public Student(String n){
        name = n;
        numStudents++;
        this.rollNumber = numStudents;
    }

    public void print(){
        System.out.println(name + " " + rollNumber);
    }

    public static int getNumStudents(){
        return numStudents;
    }

    public int getRollNumber(){
        return rollNumber;
    }
    
    public void setRollNumber(int rollNumber){
        if(rollNumber >= 0){
            this.rollNumber = rollNumber;
        }else{
            this.rollNumber = 0;
        }
    }
}