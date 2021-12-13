import java.util.Scanner;

public class Test2a {

    public static void print2DArray(int input[][]) {
        int n = input.length;
        int m = input[0].length;
        for(int i=0;i<n;i++){
            int r = n-i;
            for(int k=r;k>=1;k--){
                for(int j=0;j<m;j++){
                    System.out.print(input[i][j]+" ");
                }
                System.out.println();
            }
        }
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int column = sc.nextInt();
            int[][] arr2d = new int[row][column];
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    arr2d[i][j] = sc.nextInt();
                }
            }
            print2DArray(arr2d);
    }
}
