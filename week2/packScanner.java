import java.util.Scanner;

public class packScanner {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a number");
        String next = kb.nextLine();
        int num1 = Integer.parseInt(next);

        System.out.println("Input a number");
        String next2 = kb.nextLine();
        int num2 = Integer.parseInt(next2);

        int res = num1+num2;
        System.out.println("Total is " + res);
        kb.close();  
    }

    
}
