import java.util.Scanner;

public class Test2c {

    static String minWord = "";
    public static String minLengthWord(String input){
        int len = input.length();
        int si = 0, ei = 0;
        int min_length = len, min_start_index = 0;
        while (ei <= len)
        {
            if (ei < len && input.charAt(ei) != ' ')
            {
                ei++;
            }
            else
            {
                int curr_length = ei - si;
                if (curr_length < min_length)
                {
                    min_length = curr_length;
                    min_start_index = si;
                }
                ei++;
                si = ei;
            }
        }
        minWord = input.substring(min_start_index, min_start_index + min_length);
        return minWord;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String ptr = minLengthWord(str);
        System.out.println(ptr);
    }
}