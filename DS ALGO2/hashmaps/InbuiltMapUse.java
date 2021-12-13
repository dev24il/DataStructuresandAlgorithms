package hashmaps;
import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // insert

        map.put("abc",1);
        map.put("def",3);
        map.put("abc",4);
        // presence
        if(map.containsKey("abc")){
            System.out.println("map has abc");
        }
        if(map.containsKey("abc1")){
            System.out.println("map does not have abc");
        }

        // get value
        int v = map.get("abc");
        System.out.println(v);

        // int v1 = map.get("abc1");
        // System.out.println(v1);       -----> Null pointer exception

        // remove
        map.remove("abc");
        if(map.containsKey("abc")){
            System.out.println("map has abc");
        }

        // size
        System.out.println(map.size());

        // iterate
        Set<String> keys = map.keySet();
        for(String s : keys){
            System.out.println(s);
        }

    }
}