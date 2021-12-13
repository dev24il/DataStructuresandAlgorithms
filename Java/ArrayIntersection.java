import java.util.Scanner;

public class ArrayIntersection {

    public static void intersections(int arr1[], int arr2[]) {
        int b = 0, k=0;
        if(arr1.length>=arr2.length){
            b = arr1.length;
        }else{
            b = arr2.length;
        }

        int g = 0;
        int arr3[] = new int[b];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3[k] = arr1[i];
                    arr2[j] = Integer.MIN_VALUE;
                    k++;
                    break;
                }
            }
        }
        g = k;

        for(int l=0;l<g;l++){
            System.out.print(arr3[l]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            int n1 = sc.nextInt();
            int arr1[] = new int[n1];
            for(int j=0;j<n1;j++){
                arr1[j] = sc.nextInt();
            }

            int n2 = sc.nextInt();
            int arr2[] = new int[n2];
            for(int j=0;j<n2;j++){
                arr2[j] = sc.nextInt();
            }
            intersections(arr1, arr2);
        }

        sc.close();
    }
}
