import java.util.Scanner;

public class AreaOfAPentagon {
    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        double r = Double.parseDouble(kb.nextLine());
        // 圆周率π
        double pi = Math.PI; 
        double s = 2*r*Math.sin(pi/5);
        double area = 5*s*s/(4*Math.tan(pi/5));

        System.out.println("Area = "+area);
        kb.close();
    }
    
}

// 下列为规定小数点后几位

// import java.text.DecimalFormat;

// public class DecimalFormatExample {
//     public static void main(String[] args) {
//         double pi = Math.PI; // 圆周率π
//         DecimalFormat df = new DecimalFormat("#0.000000"); // 格式化数字为小数点后6位

//         String formattedPi = df.format(pi); // 格式化π的值

//         System.out.println("π的值为：" + formattedPi);
//     }
// }
