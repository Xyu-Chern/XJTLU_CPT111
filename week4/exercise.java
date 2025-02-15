public class exercise {
    public static void main(String[] args){
        int[] nums = {1, 2, 3,4,5};
        int[] copyNums = copyEven(nums);
        printInts(copyNums);
        diamond(5);
        printInts(arithSeries(3));
        bandMatrix(4,1);
        int[] abb ={11, 55, 100, 200, 300, 7};
        printInts(evenOddSwap(abb));
    }
    public static int[] copyEven(int[] nums) {
        int m = (nums.length+1)/2;
        int[] result = new int[m];
        for (int i =0; i<nums.length;i++){
            if (i%2==0){
                result[i/2]=nums[i];
            }  
        }
        return result;
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
    
    public static void diamond(int n) {
        
        for (int i =1; i<=(n+1)/2;i++){

            for (int j =1; j<=n; j++){

                if( j>=(n+1)/2-(i-1) && j<=(n+1)/2+i-1 )
                    System.out.print("* ");
                else
                    System.out.print(". ");
                if (j==n){                   
                   System.out.println(" ");
                }
                   
            }
        }
        for (int i =(n+1)/2+1; i<=n;i++){
            int m=n+1-i;
            for (int j =1; j<=n; j++){

                if( j>=(n+1)/2-(m-1) && j<=(n+1)/2+m-1 )
                    System.out.print("* ");
                else
                    System.out.print(". ");
                if (j==n){                   
                   System.out.println(" ");
                }
                   
            }
        }
    }

    public static int[] arithSeries(int n) {
        int[] result = new int[n*(n+1)/2];
        int tmp=0;
        for (int i =1;i <=n;i++){
            for (int j =1;j<=i;j++){
                result[tmp]=j;
                // System.out.println(tmp+j-1+" "+j);
                tmp++;
            }
            
        }
        return result;
    }
    public static void bandMatrix(int n, int width){
        for (int i =1;i <=n;i++){
            for (int j =1;j<=n;j++){
                if (j<=i+width&&j>=i-width)
                   System.out.print("*  ");
                else
                   System.out.print("0  ");
                if (j==n)
                   System.out.print("\n");
             
            }
        }
    }

    public static int[] evenOddSwap(int[] nums) {
        int[] result1 =new int[nums.length/2];
        int[] result2 =new int[nums.length/2];
        int t1=0;
        int t2=0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]%2==0){
                result2[t2]=i;
               t2 ++;
            }
            else {
               result1[t1]=i;
               t1 ++;
            }     
        }
        for (int i =0;i<nums.length/2;i++){
            int tmp =nums[result1[i]];
            nums[result1[i]]=nums[result2[i]];
            nums[result2[i]]=tmp;
        }
        return nums;

    }





}
