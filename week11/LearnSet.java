package week11;

import java.util.HashSet;
import java.util.Set;


public class LearnSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);//[A, B, C]
        System.out.println(set.contains("A"));//true
        set.remove("C");
        System.out.println(set);//[A, B]
    
        for (String string : set) {
            System.out.println(string);
        }
        
        Set<String> set1 = new HashSet<>();
        set1.add("C");
        set1.add("D");
        set1.add("A");
        set1.add("F");
        System.out.println(set1);//[A, C, D, F]

        set.addAll(set1);//并集
        System.out.println(set);//[A, B, C, D, F]

        Set<String> set2 = new HashSet<>();
        set2.add("C");
        set2.add("E");
        System.out.println(set2);//[C, E]

        set1.retainAll(set2);//交集
        System.out.println(set1);//[C]

        Set<String> set3 = new HashSet<>();
        set3.add("C");
        set3.add("D");
        set3.add("A");
        set3.add("F");
        System.out.println(set3);//[A, C, D, F]

        set3.removeAll(set2);//set3-set2
        System.out.println(set3);//[A, D, F]

        System.out.println(set3.containsAll(set2));//false
        System.out.println(set3.containsAll(set3));//true

        System.out.println(set3.size());//3

        set3.clear();
        System.out.println(set3);//[]

    }
}
    






