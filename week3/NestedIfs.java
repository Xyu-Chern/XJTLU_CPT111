import java.util.Scanner;


public class NestedIfs {
    public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    int score =  Integer.parseInt(kb.nextLine());

    if (score < 74)
        System.out.println("Not a hurricane");
    else {
        if (score < 96)
            System.out.println("Category 1 hurricane");
            else {
                if (score < 111)
                    System.out.println("Category 2 hurricane");
                else {
                    if (score < 131)
                        System.out.println("Category 3 hurricane");
                    else{
                        if (score < 156)
                            System.out.println("Category 4 hurricane");
                        else
                            System.out.println("Category 5 hurricane");
                    }
                }
            }
        }
    kb.close();
    }
}