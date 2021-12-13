package hashmaps;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		ArrayList<Integer> brr = new ArrayList<>();

        Arrays.sort(arr);
        int si = arr[0], ei = arr[0], ct = 1;
        int fi = 0, fe = 0, ctr = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                if(ctr == 0){
                    fi = arr[i-1];
                }
                fe = arr[i];
                ctr++;
            }else{
                ctr = 0;
                fi = 0;
                fe = 0;
            }
            if(ctr >= ct){
                ct = ctr;
                si = fi;
                ei = fe;
            }
        }

        if(ct == 1){
            brr.add(si);
            return brr;
        }
        brr.add(si);
        brr.add(ei);
        return brr;
    }
}
