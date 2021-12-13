public class ScopeOfVariables {
    public static void main(String[] args) {
        
        int i = 1;
        int j = 10;
        while(i<=5){
            j = 10;
            System.out.println(j);
            i++;
            j++;
        }
        System.out.println(j);

        int a = 10;
        // int a = 100;    --->not allowed
        a = 100;

        if(a>=100){
            int b = 10;
            System.out.println(b);
        }else{
            int c = 20;
            int b = 20;
            System.out.println(c);
        }
        // System.out.println(b); Accessing from outside the scope
    }
}
