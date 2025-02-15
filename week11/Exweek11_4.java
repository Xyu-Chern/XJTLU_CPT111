package week11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exweek11_4 {
    // Exercise #11.5
    public static String evenAppend(List<String> list) {
        String letter ="";

        Map<String, Integer> map = new HashMap<>();
        int num;
        for (String word : list) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                num = map.get(word);
                map.put(word, num + 1);
                if (map.get(word)%2==0){
                    letter=letter+word;
                }
            }
        }

        return letter;
        
    }

    public static Map<String, String> sameFirstLetter(List<String> list) {

        Map<String, String> map = new HashMap<>();

        for (String word : list) {
            String fisrLetter=Character.toString(word.charAt(0));
            if (!map.containsKey(fisrLetter)) {
                map.put(fisrLetter, word);
            } 
            else {
                String letter = map.get(fisrLetter);
                map.put(fisrLetter,letter+","+word);

            }
        }

        return map;
    
    
    
    }

    public static void main(String[] args){
        List<String> list = Arrays.asList("a", "b", "a");
        System.out.println(evenAppend(list));
        
        List<String> list1 = Arrays.asList("a", "b", "b", "a", "a");
        System.out.println(evenAppend(list1));

        List<String> list3 = Arrays.asList("alice", "bob", "apple", "banana");
        Map<String, String> map = sameFirstLetter(list3);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }


    }



        
}




