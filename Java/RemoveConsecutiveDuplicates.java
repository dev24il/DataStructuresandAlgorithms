import java.util.*;

public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        String ptr = "";
        int n = str.length();
        char ch1[] = str.toCharArray();
        for(int i=0;i<n-1;i++){
            if(ch1[i]!=ch1[i+1]){
                ptr += ch1[i];
            }
        }
        ptr += ch1[n-1];
        return ptr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
