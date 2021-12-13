package hashmaps;

public class PairsWithDiff {
    public static int getPairsWithDifferenceK(int arr[], int k) {
        if(arr.length <= 1){
            return 0;
        }

        int ct = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(Math.abs(arr[i]-arr[j]) == k){
                    ct++;
                }
            }
        }
		return ct;
	}
}
