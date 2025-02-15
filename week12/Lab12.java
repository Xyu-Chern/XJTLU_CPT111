package week12;

import java.util.ArrayList;
import java.util.List;

public class Lab12 {
    public static void main(String[] args) {
        System.out.println(stringCheck("aabbaa","aa",2));
        System.out.println(stringCheck("aabb","aa",2));
        System.out.println(stringCheck("bb","aa",2));
        System.out.println(stringCheck("","aa",2));
        System.out.println(stringCheck("aaaaaa","aaa",4));

        
        List<Integer> list1=new ArrayList<>();
        list1.add(12);
        list1.add(23);
        list1.add(12);
        list1.add(23);
        list1.add(12);
        list1.add(23);
        list1.add(12);
        list1.add(23);
        list1.add(23);
        System.out.println(intCheck(list1, 23, 5));
        List<Integer> list2=new ArrayList<>();
        System.out.println(intCheck(list2, 23, 5));
    }

    public static boolean stringCheck(String source , String target ,int k){
        if (source!=""){
            if (source.contains(target)){
                return stringCheck(source.substring(source.indexOf(target)+target.length()) , target,k-1);
            }
        }
        return k<=0; 
    }

    public static boolean intCheckh(List<Integer> list1, int n ,int k,int i){
        if (!list1.isEmpty()&& i<list1.size()){
            if (list1.get(i)==n){
                return intCheckh(list1,n,k-1,i+1);
            }
            else{
                return intCheckh(list1,n,k,i+1);
            }
        }
        return k<=0; 
    }

    public static boolean intCheck(List<Integer> list1, int n ,int k){
        return intCheckh(list1,  n , k,0); 
    }




}