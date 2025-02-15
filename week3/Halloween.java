public class Halloween {
    public static void main(String[] args) {
        int i = 0;
        boolean tmp=true;
        while (tmp) {
            i ++;
            System.out.println("i = "+i);
            System.out.println("Halloween!");
            if (i>=8)
               tmp = false;
        }
    }
}
