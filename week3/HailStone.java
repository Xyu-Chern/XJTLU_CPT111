import java.util.Scanner;

public class HailStone {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n =  Integer.parseInt(kb.nextLine());
        int length =1;
        while (n!=1){
            if (n%2==1){
                n = 3*n+1;
                length ++;
            }
            else{
                n = n/2;
                length ++;
            }
        }
        System.out.println(length);
        kb.close();
        
        
    }
}