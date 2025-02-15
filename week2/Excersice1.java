
import java.util.Scanner;

public class Excersice1 {
    public static void main(String[] args){

        Scanner mn = new Scanner(System.in);

        String next= mn.nextLine();
        int num1 = Integer.parseInt(next);
        System.out.println("input the min value: \n" + num1);


        String next1= mn.nextLine();
        int num2 = Integer.parseInt(next1);
        System.out.println("input the max value: \n" + num2);

        double rand1= Math.random();
        System.out.println(rand1);
        
        boolean a= 3>=3;
        System.out.println(a);
        
        // Math.round()是用来四舍五入一个数值
        int c=(int) Math.round(2.715);
        System.out.println(c);



        mn.close();
    }
    
}


 


