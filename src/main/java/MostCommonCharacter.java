import java.util.HashMap;
import java.util.Iterator;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
        
        for (int i=0; i<str.length();i++) {
            Character ch = str.charAt(i);
        if(hm.containsKey(ch)){
            hm.put(ch,hm.get(ch)+1);
        }else{
            hm.put(ch,0);
        }
        
        }
        int max =0;
        char c = ' ';
        for(Character key : hm.keySet()){
            if(hm.get(key)>max){
                max = hm.get(key);
                c = key;
            }
        }

        return c;
    }
}
