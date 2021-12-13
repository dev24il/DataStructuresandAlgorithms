import java.util.*;

public class CompressTheString {
    public static String getCompressedString(String str) {
        String ptr = "";
        int len = str.length();
        int max = 0;
        for (int i = 0; i < len-1; i++) {
            if(str.charAt(i)==str.charAt(i)){
                max += 1;
            }
            if(str.charAt(i)!=str.charAt(i+1)){
                ptr += str.charAt(i);
                if(max!=1){
                    ptr += max;
                }
                max = 0;
            }
        }
        ptr += str.charAt(len-1);
        if(max>1){
            ptr += (max+1);
        }
        return ptr;
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(getCompressedString(str));
    }
}
