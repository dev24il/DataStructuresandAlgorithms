import java.util.Scanner;

public class Boundary {

    public static void totalSum(int[][] mat) {
        int requiredSum = 0;
        int N = mat.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j || (i + j) == N - 1) {
                    requiredSum += mat[i][j];
                }
                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) {
                    requiredSum += mat[i][j];
                }
            }
        }
        System.out.println(requiredSum);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int l=1;l<=n;l++){
            int row = sc.nextInt();
            int[][] arr2d = new int[row][row];
            for(int i=0;i<row;i++){
                for(int j=0;j<row;j++){
                    arr2d[i][j] = sc.nextInt();
                }
            }
            totalSum(arr2d);
        }
    }
}
