import java.util.Scanner;

public class FindLargest {

    public static void findLargest(int mat[][]){
        int a = mat.length;
        int b = mat[0].length;
        int max1 = 0,max2 = 0;
        int r = 0,c = 0;
        for(int i=0;i<b;i++){
            int sum = 0;
            for(int j=0;j<a;j++){
                sum += mat[j][i];
            }
            if(sum>max1){
                max1 = sum;
                r = i;
            }
        }

        for(int i=0;i<a;i++){
            int sum = 0;
            int j=0;
            for(;j<b;j++){
                sum += mat[i][j];
            }
            if(sum>max2){
                max2 = sum;
                c = j;
            }
        }

        if(max1>=max2){
            System.out.println("row " + r + " " + max1);
        }else{
            System.out.println("column " + c + " " + max2);
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
            findLargest(arr2d);
        }
    }
}
