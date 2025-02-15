import java.util.Scanner;

public class RightTriangle{
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a =  Integer.parseInt(kb.nextLine());
        int b =  Integer.parseInt(kb.nextLine());
        int c =  Integer.parseInt(kb.nextLine());
        boolean contrast = false;
        if ( a>0 && b>0 && c>0 ){
            if (a*a +b*b==c*c ||c*c +b*b==a*a ||c*c +a*a==b*b )
                contrast= true;
        }
        System.out.println(contrast);
        kb.close();     
    }
}