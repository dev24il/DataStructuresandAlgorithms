public class FunctionOverloading {

    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a){
        return a+1;
    }
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println(sum(a));    // based on runtime and no. of arguments
        System.out.println(sum(a,b));
    }
}
