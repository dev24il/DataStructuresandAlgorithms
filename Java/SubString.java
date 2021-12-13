import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Coding";
        // String substr = str1.substring(2);
        String substr = str1.substring(1,5);
        System.out.println(substr);

        String str;
        str = sc.next();
        String str2 = sc.next();
        System.out.println(str + " " + str.length());
        System.out.println(str2 + " " + str2.length());
        // // str = sc.nextLine();
    }
}