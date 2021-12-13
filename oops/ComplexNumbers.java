package oops;

public class ComplexNumbers {
    
    int real;
    int imaginary;

    public ComplexNumbers(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void multiply(ComplexNumbers c2){
        ComplexNumbers n1 = new ComplexNumbers(this.real, this.imaginary);
        this.imaginary = c2.imaginary*n1.real + c2.real*n1.imaginary;
        this.real = c2.real*n1.real - c2.imaginary*n1.imaginary;
    }

    public void plus(ComplexNumbers c2){
        this.real = c2.real + this.real;
        this.imaginary = c2.imaginary + this.imaginary;
    }

    public void print(){
        System.out.println(this.real + " " + "+" + " i" + this.imaginary);
    }
}
