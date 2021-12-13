import java.util.Scanner;

public class ReverseEachWord {
    public static String reverseEachWord(String str){
        String ptr = "";

        int n = str.length();
        int start = 0;
        int i=0;
        for(;i<n;i++){
            if(str.charAt(i)==' '){
                String word = "";
                for(int j=start;j<=i-1;j++){
                    word = str.charAt(j) + word;
                }
                start = i+1;
                ptr += word + " ";
            }
        }
        String word = "";
        for(int j=start;j<=i-1;j++){
            word = str.charAt(j) + word;
        }
        ptr += word;
        return ptr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String ptr = reverseEachWord(str);
        System.out.println(ptr);
    }
}
