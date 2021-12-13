

public class MoreOnFunctions {

    public static int Sum(int a,int b){
        return a+b;
    }

    public static void printEvenNumbers(){
        for(int i=2;i<=100;i+=2){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int result = Sum(12,34);
        System.out.println(result);

        printEvenNumbers();
    }
}
