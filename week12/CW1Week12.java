package week12;

import java.util.*;

public class CW1Week12 {
    
    // Exercise #12.1
    public static int numXY(String input) {

        if (input.indexOf("XY")!=-1){
            return 1+ numXY(input.substring(input.indexOf("XY")+2));
        }
		return 0;
    }
    

    public static String remDup(String input) {
        if (input.length()>1){
            if(input.charAt(0)!=input.charAt(1)){
                return Character.toString(input.charAt(0))+remDup(input.substring(1));
            }
            else{
                return remDup(input.substring(1));
            }
        }
		return input;
    }
    

    public static String sepStar(String input) {

        if (input.length()>1){
            if(input.charAt(0)==input.charAt(1)){
                return Character.toString(input.charAt(0))+"*"+sepStar(input.substring(1));
            }
            else{
                return Character.toString(input.charAt(0))+sepStar(input.substring(1));
            }
        }
		return input;

    }
    
    
    // Exercise #12.4 Recursive Smallest Integer
    // Appear in FINAL EXAM 2019
    
    public static int smallest(int[] array) {
        return smallesth(array, 0,array[0]);
    }

    private static int smallesth(int[] array, int start,int smallnum) {
        if (start<array.length){
            if (array[start]<smallnum){
                return smallesth(array,start+1,array[start]);
            }
            else{
                return smallesth(array,start+1,smallnum);
            }
        }
		return smallnum;
    }
	
	
	// CW1 12.1 Recursive Replace Odd with Zero
	public static void replaceOddZero(List<Integer> list) {
		replaceOddZeroHelper(list, 0);
	}

	private static void replaceOddZeroHelper(List<Integer> list, int start) {
        if(start<list.size()){
            if (list.get(start)%2!=0){
                list.set(start,0);
            }
            replaceOddZeroHelper(list, start+1);
        }
	}
	
    public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		replaceOddZero(list);
		System.out.println(list);				   
        
        // [0, 2, 0, 4, 0]
		
		// add your own test cases :
		
		
		
		
		
    }
    
}
