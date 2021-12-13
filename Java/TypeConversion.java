public class TypeConversion {
    public static void main(String[] args){
        // float f = 10.5f;

        
        char ch = 'a';
        int i = ch;
        // ch = (char)i;       loss of data explicit conversion
        System.out.println(i);
    }
}
