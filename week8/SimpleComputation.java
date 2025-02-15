package week8;

import java.util.Arrays;

public class SimpleComputation {
    public static void main(String[] args) {
        int i=1;
        double[] a ={1,2,3,4,5};
        while (i<a.length){
            System.out.println(a[i]);
            i++;
        }
        System.out.println("   Winter a[i]  dd  !:".trim());
        System.out.println(Arrays.toString(generateSeries(4)));
        System.out.println(calculateXYZ("xxx"));
        System.out.println(calculateXYZ1("xxx"));
        System.out.println(19.0/5);

    }
    public static double[] generateSeries(int n) {
        double[] Arraylist =new double[n];
        for(int i=1; i <=n;i++){
            Arraylist[i-1]= (double) 1/(i*i);
        }
    
        return Arraylist;
    }

    
    public static int calculateXYZ1(String input) {
        int totalCount = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                int count = 0;
                for (int k = 0; k < substring.length(); k++) {
                    if (substring.charAt(k) == 'x' || substring.charAt(k) == 'y' || substring.charAt(k) == 'z') {
                        count++;
                    }
                }
                totalCount += count;
            }
        }
        return totalCount;
    }
    
    

    public static int calculateXYZ(String input) {
        int len =input.length();
        int sum =0;
        for (int i=0;i<len;i++){
            int check_x = 0;
            int check_y = 0;
            int check_z = 0;
            for (int step=0;step<=len-1-i;step++){
                if (input.charAt(i+step)=='x'){
                    check_x=check_x+1;
                }
                if (input.charAt(i+step)=='y'){
                    check_y=check_y+1;
                }
                if (input.charAt(i+step)=='z'){
                    check_z=check_z+1;
                }
                sum =sum+check_x+check_y+check_z;
            }

        }
        return sum;
    
    
    }
}