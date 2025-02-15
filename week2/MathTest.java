public class MathTest {
    public static void main(String[] args){
        double x =1.6;
        double y = 2.0;
        double pi =Math.PI;

        System.out.println(Math.exp(x));

        // e^x-1
        System.out.println(Math.expm1(x));

        // floor()向下取整,最后输出带一位小数，如1.6--》1.0
        System.out.println(Math.floor(x));
        // round()四舍五入,最后输出不带小数，如1.6--》2
        System.out.println(Math.round(x));

        // (x^2+y^2)^0.5
        System.out.println(Math.hypot(x,y));

        System.out.println(Math.log(x));
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));

        // 存在 x*x 在位数上 比 Math.pow(x,y) 多的情况
        System.out.println(Math.pow(x,y));

        // Math.signum(x) 作用是判断给定参数 x 的符号，并返回:如果 x 大于 0，则返回 1.0/如果 x 等于 0，则返回 0.0/如果 x 小于 0，则返回 -1.0。
        System.out.println(Math.signum(x));

        System.out.println(Math.toDegrees(pi));
        System.out.println(Math.toRadians(180.0));

        // System.out.println(10/3.0);  3.3333333333333335
    }   
}
