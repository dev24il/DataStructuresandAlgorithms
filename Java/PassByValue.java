public class PassByValue {
    public static int increment(int n){
        n++;
        return n;
    }
    public static void main(String[] args) {
        int n = 10;
        n = increment(n);
        System.out.println("Main " + n);
    }
}
