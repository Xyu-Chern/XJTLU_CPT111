import java.util.Scanner;

public class NegZeroPos {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int num =  Integer.parseInt(kb.nextLine());  
        if (num < 0) {
            System.out.println("Negative");
        }
        else if (num == 0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive");
        }
    
    kb.close();
    }
}

