public class cw4 {
     public static void main(String[] args){
        int[] nums1 = {1, 2,6};
        System.out.println(sumOfProper(nums1));
        int[] nums2 ={10,25};
        System.out.println(sumOfProper(nums2));

    }
    public static int sumOfProper(int[] nums) {
        int len =nums.length;
        int sum =0;
        for (int index =0;index<len;index++){
            if (nums[index]%(index+1)==0){
                sum =sum +nums[index];
            }

        }
        return sum;
    
    
    
    }





}
