import java.util.Scanner;
public class MaximumIntValue {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
    
        int x =  Integer.parseInt(kb.nextLine());   
        int y =  Integer.parseInt(kb.nextLine());  
        int max;
        if (x > y) {
            max = x;
        }
        else {
            max = y;
        }
        System.out.println(max);

        kb.close();
    }
}    