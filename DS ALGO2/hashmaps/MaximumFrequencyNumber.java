package hashmaps;
import java.util.HashMap;

public class MaximumFrequencyNumber {
    public static int maxFrequencyNumber(int[] arr){ 
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int ele=arr[i];
            if (countMap.containsKey(ele)){
                countMap.put(ele,countMap.get(ele)+1);
            }else{
                countMap.put(ele,1);
            }
        }
        
        int maxCount = Integer.MIN_VALUE, maxEle = arr[0];
        for (int i=0;i<arr.length;i++){
            if (countMap.get(arr[i])>maxCount){
                maxCount=countMap.get(arr[i]);
                maxEle=arr[i];
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {
        int[] arr = {2,12,2,11,12,2,1,2,2,11,12,2,6};
        System.out.println(maxFrequencyNumber(arr));
    }
}
