public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        // int c = a & b;
        // int c = a | b;
        int c = a ^ b;
        System.out.println(c);
        System.out.println(~a);
        System.out.println(a << 3);     // generally multiplies number by 2
        System.out.println(a >> 1);     // dividing by 2
    }
}
