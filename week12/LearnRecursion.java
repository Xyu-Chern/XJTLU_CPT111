package week12;

public class LearnRecursion{
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(handShake(12));
    }

    public static long fact(int n) {
        if (n == 0) 
            return 1; 
        else
            return fact(n-1) * n;
    } 
    
    public static long handShake(int n){
        if (n<=1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        return handShake(n-1)+n-1;
        
    }
}