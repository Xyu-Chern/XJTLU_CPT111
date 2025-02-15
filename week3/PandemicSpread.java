


import java.util.Scanner;

public class PandemicSpread {
    
    public static void main(String[] args) {
            
        Scanner kb = new Scanner(System.in);
        int init =  Integer.parseInt(kb.nextLine());
        int numinfect =  Integer.parseInt(kb.nextLine());
        int population =  Integer.parseInt(kb.nextLine());
        int day = 1;
        while (init < population){
            init = init * (1 +numinfect);
            day ++;
        }



        System.out.println(day);
        kb.close();
        
    }
}