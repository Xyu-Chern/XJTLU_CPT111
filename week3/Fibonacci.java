
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
    
        Scanner kb = new Scanner(System.in);
        int input =  Integer.parseInt(kb.nextLine());
        int a0=0;
        int a1=1;
        int tmp=0;
        String sum ="";
        if (input >0)
            sum = Integer.toString(a0)+" ";
        while (a1 < input) {
            sum= sum+Integer.toString(a1)+" ";
            tmp=a1;
            a1 =a1+a0;
            a0=tmp;
        }
        System.out.println(sum);
        kb.close();
        }
}



