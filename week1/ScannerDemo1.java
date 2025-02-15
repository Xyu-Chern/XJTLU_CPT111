import java.util.Scanner;

public class ScannerDemo1{
    public static void main(String[] args){
        Scanner mn = new Scanner(System.in);
        System.out.println("请输入整数");
        String next= mn.nextLine();
        System.out.println("Name is "+next);
        mn.close();
    }
        
}
