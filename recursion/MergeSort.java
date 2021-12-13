package recursion;


public class MergeSort {

    public static void merge(int[] arr1,int[] arr2,int[] arr){
        int i=0,j=0,k=0;
        int m = arr1.length, n = arr2.length;

        while(i!=m && j!=n){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i!=m){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j!=n){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr){
        if(arr.length<=1){
            return;
        }
        int n = arr.length;
		int mid = n/2;
        int s1[] = new int[mid];
        for(int i=0;i<mid;i++){
            s1[i] = arr[i];
        }
        int curr = n-mid;
        int s2[] = new int[curr];
        for(int i=mid,j=0;i<n && j<curr;i++,j++){
            s2[j] = arr[i];
        }

        mergeSort(s1);
        mergeSort(s2);
        merge(s1, s2, arr);
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {23,45,12,6,78,36};
        mergeSort(arr);
        print(arr);
    }
}
