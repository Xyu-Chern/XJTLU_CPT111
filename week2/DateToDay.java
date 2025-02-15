import java.util.Scanner;

public class DateToDay {
    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        int y = Integer.parseInt(kb.nextLine());
        int m = Integer.parseInt(kb.nextLine());
        int d = Integer.parseInt(kb.nextLine());


        double a1=y-(14-m)/12;
        int a = (int) a1;
        // System.out.println(a); 
        double b1=a+a/4-a/100+a/400;
        int b = (int) b1;
        // System.out.println(b);
        double c1 =m +12*((14-m)/12)-2;
        int c = (int) c1;
        // System.out.println(c);

        int day = (d+b+(31*c)/12)%7;
        System.out.println("It's day "+day+" !"); 
        kb.close();
    }
    
}
