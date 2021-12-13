import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String str){
        String ptr = "";
        int n = str.length();
        for(int i=0;i<n;i++){
            ptr = str.charAt(i) + ptr;
        }

        // for(int i=n-1;i>=0;i--){
        //     ptr += str.charAt(i);
        // }
        return ptr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }
}
