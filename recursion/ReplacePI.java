package recursion;

public class ReplacePI {
    public static String replacePi(String s){

        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            String smallOutput = replacePi(s.substring(2));
            return "3.14" + smallOutput;
        }else{
            String smallOutput = replacePi(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        System.out.println(replacePi("piredppihs"));
    }
}
