public class ForLoops {
    public static void main(String[] args) {
        
        int n = 5;
        for(int i = 1,j = 100; i <= n && j <= 200; i++, j+=20){  // checking of condition will be (n+1) times
            System.out.println(i + " " + j);
        }
    }
}
