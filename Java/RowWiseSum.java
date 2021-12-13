import java.util.Scanner;

public class RowWiseSum {

    public static void rowWiseSum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                sum += mat[i][j];
            }
            System.out.print(sum+" ");
            sum = 0; 
        }
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int k=1;k<=t;k++){
            int row = sc.nextInt();
            int column = sc.nextInt();
            int[][] arr2d = new int[row][column];
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    arr2d[i][j] = sc.nextInt();
                }
            }
            rowWiseSum(arr2d);
        }
    }
}
