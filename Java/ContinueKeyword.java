public class ContinueKeyword {
    public static void main(String[] args) {
        
        int i = 1;
        int n = 5;
        while(i<=n){
            i++;
            if(i==4){
                continue;   // skips current iteration of the loop
            }
            System.out.println(i);
        }
    }
}
