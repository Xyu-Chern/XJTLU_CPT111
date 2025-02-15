import java.util.Scanner;

public class AbsoluteIntValue{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);

        Scanner kb = new Scanner(System.in);     
        int num = Integer.parseInt(kb.nextLine());
        if (num < 0) {
            num = -num;
        }
        System.out.println(num);
        kb.close();
    }
}


