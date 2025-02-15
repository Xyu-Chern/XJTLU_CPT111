import java.util.Arrays;
import java.util.Scanner;

public class lab1{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        String [] myArray = new String[3];
        for (int i =1;i <= 3;i++){
            System.out.println("Please write a name!");
            String name1 = kb.nextLine();
            myArray[i-1]=name1;
        }
        System.out.println(Arrays.toString(myArray));

        int [] n ={0,1,4,9,16,25,36,49,64,81,100};
        showSquares(n);
        
        System.out.println("Please write a number!");
        int number = Integer.parseInt(kb.nextLine());
        for (int i =1;i <= number;i++){
            for (int m =1;m <= number;m++){
                if(m !=number)
                   System.out.print(i*m+" ");
                else
                   System.out.print(i*m+"\n");
            }
        }
        kb.close();

    }
    public static void showSquares(int[] n){
        for(int i =0; i < n.length; i++){
            System.out.println("Name: "+i+"   "+ "Square: "+n[i]+"   "+ "Cube: "+i*i*i);
        }
    }
}