import java.util.Scanner;

public class PolarCoordinate {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        double x = Double.parseDouble(kb.nextLine());
        double y = Double.parseDouble(kb.nextLine());

        double r= Math.sqrt(x*x+y*y);
        double theta = Math.atan2(y, x);
        
        System.out.println("r = "+r);
        System.out.println("theta = "+theta);

        kb.close();
    }
    
}
