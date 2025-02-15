public class NewTest{
    public static void main(String[] args){
        int a = 10;
        System.out.println(a);

        int result = 3+3;
        System.out.println(result);

        int num1=1;
        int num2=2;
        int result1= num1+num2;
        System.out.println(result1);
        num1=4;
        System.out.println(result1);

        int b;
        b=1;
        b++;
        System.out.println("b = "+b);
        b-=3;
        System.out.println("b = "+b);
        b*=3;
        System.out.println("b = "+b);
        b--;
        System.out.println("b = "+b);

        b = (int) Math.pow(b, 3); 
        System.out.println("b = "+b);

        b = (int) Math.pow(b, 2); 
        System.out.println("b = "+b);
        
        // 开根号
        int num3 = 9;
        double root = Math.sqrt(num3);
        System.out.println(root);
        // 取最大数
        int num4 = 5;
        double root1 = Math.max(num3,num4);
        System.out.println(root1);

        // double转int
        double x = 3.456;
        int y = (int) x;
        System.out.println(y);
        
        // int转double
        int x6 = 4;
        double y6 = (double) x6;
        System.out.println(y6);

        // string转int
        String s1 = "999";
        int res1 = Integer.parseInt(s1);
        System.out.println(res1);
        
        // string转double
        String s = "99.021";
        double res = Double.parseDouble(s);
        System.out.println(res);

        // double转string
        String out1 = Double.toString(res);
        System.out.println(out1);
        // int转string
        String out2 = Integer.toString(res1);
        System.out.println(out2);

        // boolean转string
        boolean x1 = 3>=3;
        String m = Boolean.toString(x1);
        System.out.println(m);

    }
}