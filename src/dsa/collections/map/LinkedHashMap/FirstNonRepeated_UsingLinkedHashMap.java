package dsa.collections.map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeated_UsingLinkedHashMap {

    public static void main(String[] args) {
        String s= "chacha";
        int result = getFirstNonRep(s, 1);
        if(result != -1){
            System.out.print("first non repeated is "+ s.charAt(result) +".");
        }else {
            System.out.print("All characters are repeated");
        }
    }

    static int getFirstNonRep(String s, int nth_non_repeated){
        int rep_counter=0;
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        //swiss
        for(Character c : s.toCharArray() ){
            map.put(c, map.getOrDefault(c,0)+ 1);
        }
        System.out.println("map = "+ map.toString());
      //For first non -repeated

        for(Map.Entry<Character,Integer> set: map.entrySet()){
            if(set.getValue()==1){
                return 1;
            }
        }
        return -1;
    }

}
