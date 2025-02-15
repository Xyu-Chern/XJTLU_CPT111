public class labtest {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        reverseInts(nums);
        printInts(nums);

    } 

    public static void reverseInts(int[] nums) {
        int [] re_nums =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            re_nums[i]=nums[nums.length-1-i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=re_nums[i];
        }   
        
    }
    public static void printInts(int[] nums) {
        // System.out.print()方法不会自动换行
        System.out.print("[");
        for(int i = 0; i < nums.length; i++) {
            if(i != nums.length-1)
                System.out.print(nums[i] + ", ");
            else
                System.out.print(nums[i]);
            }
        System.out.println("]");
    } 
}
