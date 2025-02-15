package week9;

import java.util.Scanner;

public class learn9 {
    public static int myIntDiv(int a, int b) {
        if (b == 0)
        // ArrayIndexOutOfBoundsException
        // ArithmeticException
        // IllegalArgumentException
        // NumberFormatException –thrown by parseInt/parseDouble if the String given cannot be parsed into int/double
            throw new ArithmeticException("Cannot divide by zero!");
        else
            return a / b;
        }
    
        
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        try {
            System.out.println(myIntDiv(1, n));
        }
        catch (ArithmeticException ae) {//这里ae可以随便命名不是固定的
            System.out.println("You entered a zero!");
            System.out.println(ae.getMessage());
        }
        kb.close();
    }


        


    
}