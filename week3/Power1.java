import java.util.Scanner;

public class Power1 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n =  Integer.parseInt(kb.nextLine());
        
        int i =1 , dd=1;
        while (i <= n) {
            System.out.println(dd);
            dd = dd * 2;
            i = i + 1;
        }
        // System.out.println(n);
        kb.close();
    }
}

