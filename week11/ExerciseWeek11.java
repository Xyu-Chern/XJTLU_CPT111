package week11;

import java.util.Arrays;
import java.util.List;


public class ExerciseWeek11 {
    
    // public static int maxleftright(List<Integer> list) {
	// 	int len=list.size();
    //     int max1 = 0;
    //     int max2 = 0;
    //     for (int i=0;i<len;i++){

    //         if (list.get(i) > list.get(max2)){
    //             max2=i;
    //         }
    //         if (list.get(i)>list.get(max1)){
    //             max2=max1;
    //             max1=i;
    //         }
    //         // System.out.println(max1+"+"+max2);
    //     }
    //     if (max1>=max2){
    //         return max1-max2+1-2;
    //     }
    //     return max2-max1+1-2;

    // }
    public static int maxStretch(List<Integer> list) {
		int len=list.size();
        if (len==0)
           return 0;
        int res1 = 1;
        int res =1;
        for (int j=0 ;j<len;j++){
            for (int i=j+1;i<len;i++){
                if (list.get(i) == list.get(j)){
                    res=i-j+1;
                }
            }
            if (res>res1){
                res1=res;
            }
        }
        return res1;

    }
    
    
    
    // Exercise #11.3
    public static boolean isPartitionable(List<Integer> list) {
        int len=list.size();
        if (len==0)
           return false;
        int sum=0;
        for (int i=0;i<len;i++){
            sum=sum+list.get(i);
        }
        int partialsum=0;
        for (int j=0 ;j<len-1;j++){
            partialsum=partialsum+list.get(j);
            if(partialsum==sum/2.0){
                // System.out.println(partialsum);
                return true;
            }

        }
        return false;
    }

    
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(8, 5, 1, 2, 5, 3, 4, 5, 10);
        System.out.println(maxStretch(list1));                // 7

        List<Integer> list2 = Arrays.asList(1);
        System.out.println(maxStretch(list2));                // 5
   
        List<Integer> list_1 = Arrays.asList(1, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_1));          // true

        List<Integer> list_2 = Arrays.asList(2, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_2));          // false
        
        // add your own test case here:
        

    }
    
}
