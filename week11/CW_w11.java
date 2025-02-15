package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CW_w11 {
    public static List<String> intersectList1(List<String> list1, List<String> list2) {
    
        Map<String, Integer> map = new HashMap<>();
        for (String word : list1) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } 
        }
        List<String> result = new ArrayList<>();
        for (String i: list2){
            if (map.containsKey(i)&&map.get(i)==1) {
                result.add(i);
                map.put(i,0);
            } 

        }
        return result;
    }


    public static List<String> intersectList(List<String> list1, List<String> list2) {
        Map<String, Integer> countMap = new HashMap<>();
        List<String> intersection = new ArrayList<>();

        for (String str : list1) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        for (String str : list2) {
            if (countMap.containsKey(str) && countMap.get(str) > 0) {
                intersection.add(str);
                countMap.put(str, countMap.get(str) - 1);
            }
        }

        return intersection;
    }

    
    public static void main(String[] args){
        List<String> list1 = Arrays.asList("a", "b", "a", "c","b");
        List<String> list2 = Arrays.asList("b", "d", "a", "b", "b");
        List<String> output = intersectList(list1, list2);
                
        Collections.sort(output);
        System.out.println(output);
    }

}
