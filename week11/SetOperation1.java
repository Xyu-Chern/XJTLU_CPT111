package week11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(new Integer[] {1, 3}));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(new Integer[] {2, 5, 4}));   

        set1.addAll(set2);
        System.out.println("set1 = set1 ∪ set2 = " + set1);
        System.out.println(set1.containsAll(set2));

        Set<Integer> intersectionSet = new HashSet<>(set1);
        Set<Integer> set3 = new HashSet<Integer>();
        set3.addAll(Arrays.asList(new Integer[] {1, 5, 6, 7}));
        
        intersectionSet.retainAll(set3);
        System.out.println("set1 ∩ set3 = " + intersectionSet);        
    }
   
}
