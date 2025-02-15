import java.util.Scanner;

public class BritishMarkingCriteria {
    public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    int score =  Integer.parseInt(kb.nextLine());

    // if (score >= 70)
    // System.out.println("First Class");
    // if (score >= 60 && score < 70)
    // System.out.println("Upper Second Class");
    // if (score >= 50 && score < 60)
    // System.out.println("Lower Second Class");
    // if (score >= 40 && score < 50)
    // System.out.println("Third Class");
    // if (score < 40)
    // System.out.println("Fail");

    // 在if、else if、else、while、for等条件语句中，只有一条代码语句需要执行可以省去大括号，所以下列if可以省但是else不可以省去
    if (score < 40)
        System.out.println("Fail");
    else {
        if (score < 50)
            System.out.println("Third Class");
            else {
                if (score < 60)
                    System.out.println("Lower Second Class");
                else {
                    if (score < 70)
                        System.out.println("Upper Second Class");
                    else
                        System.out.println("First Class");
                }
            }
        }
    kb.close();
    }
}




