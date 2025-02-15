public class Demo3 {
    public static int findMax(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        System.out.println(findMax(0,1,2,3,4,54));
    }
    
}
