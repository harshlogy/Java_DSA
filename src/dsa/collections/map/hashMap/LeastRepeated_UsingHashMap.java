package dsa.collections.map.hashMap;

import java.util.HashMap;

public class LeastRepeated_UsingHashMap {
//Assuming no two digits are repeated same times
    public static void main(String[] args) {
        String s= "aaabbcdddddd";
        int result = getFirstNonRep(s, 1);
        if(result != -1){
            System.out.print("least repeated is "+ s.charAt(result) +".");
        }else {
            System.out.print("All characters are repeated");
        }
    }

    static int getFirstNonRep(String s, int nth_non_repeated){
        int rep_counter=0;
        int minRepCounter;
        HashMap<Character,Integer> map = new HashMap<>();
        //swiss
        for(Character c : s.toCharArray() ){
            map.put(c, map.getOrDefault(c,0)+ 1);
        }
        System.out.println("map = "+ map.toString());
      //For least non -repeated
        minRepCounter= map.get(s.charAt(0));
        for (int i=1 ; i<s.length(); i++){
            if(minRepCounter>map.get(s.charAt(i))){
                minRepCounter=map.get(s.charAt(i));
                System.out.println("minRepCounter: "+ minRepCounter);
            }
        }


        return minRepCounter;
    }
}
