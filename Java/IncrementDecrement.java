public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 60, b = 80;
        if(a++ > 60 && b++ > 80){                    //short circuiting is used here
            System.out.println("Inside if");
        }else{
            System.out.println("Inside else");
        }
        System.out.println("a " + a +"b " + b);

        // int a = 60;
        // // a = a+1;
        // System.out.println(a++);   //increment will be after usage
        // System.out.println(++a);   //increment will be there
        // System.out.println(a);
    }
}
