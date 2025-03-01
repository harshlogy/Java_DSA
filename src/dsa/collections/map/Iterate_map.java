package dsa.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iterate_map {



    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Hi", 1);
        map.put("Hello", 2);
        map.put("How are you", 3);
        map.put("How are you", 3);
        map.put("How are you", 3);
        System.out.println(map);
       System.out.println(map.entrySet());
        Set<Map.Entry<String, Integer>> enrtySet = map.entrySet();

        for(Map.Entry<String,Integer> set : enrtySet){
            System.out.println("Key: "+ set.getKey()+ " and value: "+ set.getValue());
        }


    }
}
