public class BreakKeyword {
    public static void main(String[] args) {
        
        int n = 5;
        int i = 1;
        while(i<=n){
            if(i==4){
                break;    // exits out of the immediate loop not with condition
                // System.out.println(i);        ------>unreachable code
            }
            System.out.println(i);
            i += 1;
        }

        System.out.println("Outside While");
    }
}
