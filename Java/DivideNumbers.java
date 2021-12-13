public class DivideNumbers {

    public static int DivideNumbers(int num,int deno){
        if(deno==0){
            return Integer.MIN_VALUE;
        }
        return num/deno;
    }

    public static void printDivisionResult(int num,int deno){
        if(deno==0){
            // exit the function
            System.out.println("Division by Zero is not allowed");
            return;
        }
        System.out.println(num/deno);
    }

    public static void main(String[] args) {
        int num = 34;
        int deno = 0;
        // int result = DivideNumbers(num,deno);
        // System.out.println(result);
        printDivisionResult(num, deno);
    }
}
