package recursion;

public class QuickSort {

    public static int partition(int[] arr, int si, int ei){
        int pivotElement = arr[si];
        int ct = 0;
        for(int i = si; i <= ei; i++){
            if(arr[i] < pivotElement){
                ct++;
            }
        }

        int temp = arr[si+ct];
        arr[si+ct] = pivotElement;
        arr[si] = temp;

        int j=si,k=ei;
        while(j < k){
            if(arr[j] < pivotElement){
                j++;
            }else if(arr[k] > pivotElement){
                k--;
            }else{
                int var = arr[j];
                arr[j] = arr[k];
                arr[k] = var;
            }
        }
        return si+ct;
    }

    public static void quickSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int pivot = partition(arr, si, ei);
        quickSort(arr, si, pivot-1);
        quickSort(arr, pivot+1, ei);
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {32,45,3,89,17,29,44};
        quickSort(arr, 0, 6);
        print(arr);
    }
}
