import java.util.Scanner;

public class GreatCircleDistance {
    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        double x1 = Math.toRadians(Double.parseDouble(kb.nextLine()));
        double y1 = Math.toRadians(Double.parseDouble(kb.nextLine()));
        double x2 = Math.toRadians(Double.parseDouble(kb.nextLine()));
        double y2 = Math.toRadians(Double.parseDouble(kb.nextLine()));

        double r = 6371.0;

        double dist= 2*r*Math.asin(Math.sqrt(Math.pow(Math.sin((x2-x1)/2.0), 2)+Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2.0), 2)));
        System.out.println(dist+" kilometres");
        kb.close();
    }
    
}