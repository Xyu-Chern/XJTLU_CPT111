// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

public class cw1 {
    public static void main(String[] args){
        System.out.println(twoSwappable("abcde","cdabe"));
        System.out.println(twoSwappable("abcde","edcba"));
        System.out.println(twoSwappable("abcde","daceb"));
        
    }

    // public static boolean twoSwappable(String a, String b) {
    //     // import java.util.HashSet;
    //     // import java.util.Set;
    //     // if (a.length() != 5) { 
    //     //     return false;
    //     // }
    
    //     Set<Integer> set1 = new HashSet<>();
    //     Set<Integer> set2 = new HashSet<>();
    
    //     for (int i = 0; i < a.length(); i++) {
    //         int num = a.charAt(i);
    //         if (i % 2 == 0) {
    //             set1.add(num);
    //         } else {
    //             set2.add(num);
    //         }
    //     }
        
    //     Set<Integer> set3 = new HashSet<>();
    //     Set<Integer> set4 = new HashSet<>();

    //     for (int i = 0; i < b.length(); i++) {
    //         int num = b.charAt(i);
    //         if (i % 2 == 0) {
    //             set3.add(num);
    //         } else {
    //             set4.add(num);
    //         }
    //     }
    //     // System.out.println(set1);
    //     // System.out.println(set2);
    //     // System.out.println(set3);
    //     // System.out.println(set4);
        
    
    //     return set1.equals(set3)&&set2.equals(set4);
    // }
    public static boolean twoSwappable(String a, String b) {
        if (a.length() != 5 || b.length() != 5) { 
            return false;
        }
    
        int[] set1 = new int[128];
        int[] set2 = new int[128];
    
        for (int i = 0; i < a.length(); i++) {
            int num = a.charAt(i);
            if (i % 2 == 0) {
                set1[num]++;
            } else {
                set2[num]++;
            }
        }
    
        for (int i = 0; i < b.length(); i++) {
            int num = b.charAt(i);
            if (i % 2 == 0) {
                set1[num]--;
            } else {
                set2[num]--;
            }
        }
    
        for (int i = 0; i < set1.length; i++) {
            if (set1[i] != 0 || set2[i] != 0) {
                return false;
            }
        }
    
        return true;
    }
    

    

}