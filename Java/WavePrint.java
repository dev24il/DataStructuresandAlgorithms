import java.util.Scanner;

public class WavePrint {

    public static void wavePrint(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length && i%2==0;j++){
                System.out.print(mat[j][i] + " ");
            }
            for(int j=mat.length-1;j>=0 && i%2!=0;j--){
                System.out.print(mat[j][i] + " ");
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
            wavePrint(arr2d);
        }
    }
}
