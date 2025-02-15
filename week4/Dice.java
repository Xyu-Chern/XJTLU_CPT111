import java.util.Arrays;

public class Dice {
    public static void main(String[] args) {    
        int[] diceList = new int[4];
        for(int i = 0; i < 4; i++){
            double rand = ((Math.random() * 6) + 1);
            int dice = (int) rand;
            diceList[i] = dice;
            System.out.println("Result is " + dice);
        }
        System.out.println(Arrays.toString(diceList));

        int total = addTwoNumbers();
        System.out.println(total);
    }

    public static int addTwoNumbers() {
        int result = 3 + 5;
        return result;
    }       
}
