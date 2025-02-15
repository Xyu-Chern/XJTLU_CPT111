import java.util.Scanner;

public class CMYKtoRGB {

    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        double cyan = Double.parseDouble(kb.nextLine());
        double magenta = Double.parseDouble(kb.nextLine());
        double yellow = Double.parseDouble(kb.nextLine());
        double black = Double.parseDouble(kb.nextLine());

        double white=1-black;
        int red = (int) Math.round(255*white*(1-cyan));
        int green = (int) Math.round(255*white*(1-magenta));
        int blue = (int) Math.round(255*white*(1-yellow));

        System.out.println("red = "+red);
        System.out.println("green = "+green);
        System.out.println("blue = "+blue);
        kb.close();
    }
    
}