package exceptions;

public class ExceptionDemo {

    public static int factorial(int num) throws NegativeNumberException{
        if(num<0){
            throw new NegativeNumberException();
        }
        int ans = 1;
        for(int i=2;i<=num;i++){
            ans = ans * i;
        }
        return ans;
    }

    public static int divide(int a ,int b) throws DivideByZeroException{
        if(b==0){
            throw new DivideByZeroException();    // checked exception
        }
        return a/b;
    }
    public static void main(String[] args)  {
        try {
            divide(10, 10);
            System.out.println(factorial(2));
        } catch (DivideByZeroException e) {
            System.out.println("Divide by zero exception raised.");
        } catch(NegativeNumberException e){
            System.out.println("Negative number exception");
        } catch(Exception e){
            System.out.println("Generic exception");
        } finally{
            System.out.println("Finally");
        }
    }
}
