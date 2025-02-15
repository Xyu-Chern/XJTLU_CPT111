// package hellostrings;
import java.util.Scanner;

public class HelloStrings {
    static Scanner keyboard;

    public static void main(String[] args){
        keyboard = new Scanner(System.in);
        System.out.println("请输入整数");
        String next= keyboard.nextLine();
        System.out.println("Name is "+next);
        keyboard.close();

    }
    
}
