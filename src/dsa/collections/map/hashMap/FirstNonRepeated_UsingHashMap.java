package dsa.collections.map.hashMap;

import java.util.HashMap;

public class FirstNonRepeated_UsingHashMap {

    public static void main(String[] args) {
        int result = getFirstNonRep("toyota", 2);
        System.out.print("second non repeated is "+ "toyota".charAt(result) +".");
    }

    static int getFirstNonRep(String s, int nth_non_repeated){
        int rep_counter=0;
        HashMap<Character,Integer> map = new HashMap<>();
        //swiss
        for(Character c : s.toCharArray() ){
            map.put(c, map.getOrDefault(c,0)+ 1);
        }
        System.out.println("map = "+ map.toString());
/*      For first non -repeated
        for (int i=0 ; i<s.length(); i++){
            if(map.get(s.charAt(i)) ==1){
                return i;
            }
        }*/

            // For second non-repeated
        for (int i=0 ; i<s.length(); i++){

            if(map.get(s.charAt(i)) ==1){
                rep_counter++;
            }
            if(rep_counter==nth_non_repeated){
                return i;
            }
        }
        return -1;
    }
}
