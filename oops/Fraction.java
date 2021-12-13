package oops;
import java.lang.Math;

public class Fraction {

    private int numerator;
    private int denominator;
    // private static int increase;

    public Fraction(int numerator,int denominator){
        if(denominator==0){
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public void print(){
        System.out.println(numerator + "/" + denominator);
    }

    public void add(Fraction f2){
        this.numerator = (this.numerator * f2.denominator) + (f2.numerator * this.denominator);
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1,Fraction f2){
        int newNum = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        int newDeno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNum, newDeno);
        return f3;
    }

    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void increment(){
        numerator = numerator + denominator;
        simplify();
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
        simplify();
    }

    public int getNumerator(){
        return numerator;
    } 

    public void setDenominator(int denominator){
        if(denominator==0){
            return;
        }else{
            this.denominator = denominator;
        }
        simplify();
    }

    public int getDenominator(){
        return denominator;
    }
}
