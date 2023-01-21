import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapReview {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Sergio");
//        map.put(2, "Moses");
//        System.out.println(map.put(6, "Moses"));
//        System.out.println(map.put(3, "Mosesss"));
//
//
//        System.out.println(map);
//
//        System.out.println(map.get(2));
//
//        System.out.println(getLastCharSet("Java Developer"));

        System.out.println(findFirstNonRepeating("Java Developer"));

    }

    public static Character getLastCharSet(String str){

        Set<Character> charMap = new LinkedHashSet<>();
        for (char temp : str.toCharArray())
            if(!charMap.add(temp)) return temp;

        return 0;
    }

    public static Character findFirstNonRepeating(String str){

        Map<Character, Integer> charMap = new HashMap<>();
        int count = 1;

        for (Character ch : str.toCharArray()) {
            if(charMap.containsKey(ch)) {
                count= charMap.get(ch);
                charMap.put(ch, count+1);
            } else charMap.put(ch, 1);;
        }

        for (Character ch:str.toCharArray()){
            if(charMap.get(ch) == 1){ System.out.println(charMap); return ch;}
        }

        return Character.MIN_VALUE;
    }
}
