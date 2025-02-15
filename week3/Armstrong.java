// 我觉得第二种明显更好值得学习

// import java.util.Scanner;

// public class Armstrong {
//     public static void main(String[] args) {
//         Scanner kb = new Scanner(System.in);
//         int a =  Integer.parseInt(kb.nextLine());
//         int k =  Integer.parseInt(kb.nextLine());
//         int number =0;
//         int digit =0;
//         int special_number_solid =a;
//         while (number != k){
//             while (a !=0 ){
//                 a =a /10;
//                 digit ++;
//             }
//             int digit_variable =digit;
//             int special_number_change =special_number_solid;
//             int special_number =special_number_solid;

//             while (digit_variable !=0){
//                 double digit_number =Math.pow(special_number%10,digit);
//                 special_number =special_number/10;
//                 int digit_number_int =(int) digit_number;
//                 special_number_change = special_number_change - digit_number_int;
//                 digit_variable --;
//             }
//             if (special_number_change ==0){
//                 System.out.println(special_number_solid);
//                 number ++;

//             } 
//             special_number_solid++;

//         }
//         kb.close();
         
//     }
// }

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a =  Integer.parseInt(kb.nextLine());
        int k =  Integer.parseInt(kb.nextLine());

        int count = 0;
        while (count < k) {
            if (isArmstrong(a)) {
                System.out.println(a);
                count++;
            }
            a++;
        }
        kb.close();
    }

    public static boolean isArmstrong(int n) {
    // 字符串类型具有一个名为 length() 的方法，可以返回字符串的长度（即字符的个数）
        int digits = Integer.toString(n).length();

        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return n == sum;
    }
}
