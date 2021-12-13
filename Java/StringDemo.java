public class StringDemo {
    public static void main(String[] args) {
        char arr[] = {'C','o','d','i','n','g'};
        String str1 = "Coding";
        String str = "";      //empty string
        String str2 = " is fun.";
        String str3 = "Coding";
        // System.out.println(str1.length());
        // System.out.println(str.length());
        // System.out.println(str1.charAt(2));
        // System.out.println(str.charAt(-1));   ---->error index out of bound
        // str1 += str2;
        str1 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.contains("ing"));
    }
}
