import java.util.Scanner;

public class BasicsOf2DArrays {

    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns:");
        int column = sc.nextInt();

        int[][] arr2d = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter the element in "+i+" row "+j+" column:");
                arr2d[i][j] = sc.nextInt();
            }
        }
        return arr2d;
    }

    public static void print2dArray(int[][] arr2d){
        int row = arr2d.length;
        int column= arr2d[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] input = takeInput();
        print2dArray(input);
        // int[][] arr2d = new int[3][4];
        // arr2d[2][1] = 12;
        // System.out.println(arr2d[2][1]);
        // // System.out.println(arr2d[2][5]); array index out of bound error
    }
}
