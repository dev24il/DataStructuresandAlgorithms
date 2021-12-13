package hashmaps;

import java.util.HashMap;

public class ExactUniqueCharacters {
    public static String uniqueChar(String str){
        HashMap<Character, Boolean> map = new HashMap<>();

        String exp = "";

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                continue;
            }else{
                exp += str.charAt(i);
                map.put(str.charAt(i), true);
            }
        }
        return exp;
	}
}
