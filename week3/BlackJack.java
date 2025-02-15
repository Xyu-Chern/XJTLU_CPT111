import java.util.Scanner;

public class BlackJack {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        int x =  Integer.parseInt(kb.nextLine());   
        int y =  Integer.parseInt(kb.nextLine());  

        if (x > 21 && y >21) 
            System.out.println(-1);
        else if (x <= 21 && y >21)
            System.out.println(x);
        else if (x > 21 && y <= 21)
            System.out.println(y);
        else if (x <= 21 && y <= 21){
            if (x < y)
                System.out.println(y);
            else
                System.out.println(x);
        }
        kb.close();
           
    }
}
