import java.util.*;

public class RemoveCharacter {

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String ptr = "";
        int n = str.length();
        char ch1[] = str.toCharArray();
        for(int i=0;i<n-1;i++){
            if(ch1[i]!=ch){
                ptr += ch1[i];
            }
        }
        if(ch1[n-1]!=ch){
            ptr += ch1[n-1];
        }
        return ptr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1 = sc.nextLine();
        char ch = str1.charAt(0);
        System.out.println(removeAllOccurrencesOfChar(str, ch));
    }
}
