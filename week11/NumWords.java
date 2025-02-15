package week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumWords {
    //注意这里static ,静态方法是在类级别上定义的方法，可以直接通过类名调用，而无需创建类的实例。
    public static Map<String, Integer> wordCount(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        int num;
        for (String word : list) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                num = map.get(word);
                map.put(word, num + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        Map<String, Integer> result = wordCount(list); // Call the wordCount method
        System.out.println(result);
    }
}

// map.containsValue(value) test whether the map has the value
// map.remove(key) delete a mapping
// map.keySet() returns a set containing all keys
