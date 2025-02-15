package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileSorter {
    private List<Integer> sortedInteger = new ArrayList<>();
    private List<String> sortedString = new ArrayList<>();

    public FileSorter(Map<String, Integer> map) {
        fileSort(map);
    }

    public List<Integer> getSortedInteger() {
        return this.sortedInteger;
    }

    public List<String> getSortedString() {
        return this.sortedString;
    }

    private void fileSort(Map<String, Integer> map) {
        int len = map.values().size();
        for (int j = 0; j < len; j++) {
            int maxnum = 0;
            for (int i : map.values()) {
                if (maxnum < i) {
                    maxnum = i;
                }
            }
            sortedInteger.add(maxnum);
            for (String k : map.keySet()) {
                if (map.get(k) == maxnum) {
                    sortedString.add(k);
                    map.remove(k);
                    break;
                }
            }
        }
    }

    
}
