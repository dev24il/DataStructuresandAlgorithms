import java.util.Scanner;

public class Spiral {

    public static void spiralPrint(int matrix[][]){
        int i, k = 0, l = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(matrix[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int l=1;l<=n;l++){
            int row = sc.nextInt();
            int column = sc.nextInt();
            int[][] arr2d = new int[row][column];
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    arr2d[i][j] = sc.nextInt();
                }
            }
            if(row!=0 && column!=0){
                spiralPrint(arr2d);
            }
        }
    }
}
