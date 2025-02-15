public class Method1{
    public static void main(String[] args) {
        int total = addTwoNumbers(3,5);
        displayTotal(total);
        total = total +addTwoNumbers(4,4);
        displayTotal(total);
        total = total +addTwoNumbers(2,2);
        displayTotal(total);
    }

    public static int addTwoNumbers(int a , int b){
        int result = a + b;
        return result;
    }

    public static void displayTotal(int input) { 
        System.out.println("**************");
        System.out.println("*Total is " + input + "*");
        System.out.println("**************");
        return ;
    } 
}
