package week11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation2 {
    public static void main(String[] args) {
        Set<Integer> set4 = new HashSet<>();
        set4.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));

        Set<Integer> set5 = new HashSet<>();
        set5.addAll(Arrays.asList(new Integer[] {2, 5}));

        Set<Integer> setDifference = new HashSet<>(set4);
        setDifference.removeAll(set5);
        System.out.println("set4 \\ set5 = " + setDifference);//set4 \ set5 = [1, 3, 4]

        setDifference.remove(1);
        System.out.println(setDifference);        
        } 
}
