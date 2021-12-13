// package generics;

public class PairUse {
    public static void main(String[] args) {

        new Pair<>("ab",100);
        Pair< Pair<String,Integer> , String> p = new Pair<>();
        
        System.out.println( p.getFirst().getFirst());
        System.out.println( p.getFirst().getSecond());



        p.setSecond("abcd");
        System.out.println(p.getFirst() + " " + p.getSecond());

        // Pair<String ,Integer> pSI = new Pair<>("ab",10);


        // Pair<String> p = new Pair<>();
        // System.out.println(p.getFirst() + " " + p.getSecond());
        // Pair<String> pS = new Pair<String>("aa","bb");
        // System.out.println(pS.getFirst() + " " + pS.getSecond());
        // Pair<Integer> pI = new Pair<Integer>(10,20);
        // System.out.println(pI.getFirst() + " " + pI.getSecond());
        // Pair<Double> pD = new Pair<Double>(10.1,20.6);
        // System.out.println(pD.getFirst() + " " + pD.getSecond();
        // Pair p = new Pair(10, 20);
        // System.out.println(p.getFirst() + " " + p.getSecond());
    }
}
 