
public class classTest {
    public static void main(String[] args){

        int countdown = 10; 
        while(countdown > 0) {
            System.out.println(countdown);
            countdown = countdown - 1; 
            // 这里k是局部变量，可以把while内部视作一个block 
            // 实际发生的是 each time the loop runs, the variable k is redeclared/reset/reinitialized to 4.
            // 但在 block 中 int k = 4; 只声明了一次是被允许的
            int k = 4;
            k++;
            System.out.println("k = " + k);
        }
        System.out.println("Go!");
        // 在while循环中声明的变量k的作用域仅限于while循环内部，无法在循环外部
        // System.out.println(k);
        
        // 值得注意的是i=10也会进入循环做完之后再是i--过程
        for( int i = 10; i > 0; i--) {
            System.out.println(i);
            }

        // 这里俩次声明i竟然是可行的！Java中的作用域规则允许在不同的块（block）内部使用相同的变量名
        for( int i = 5; i < 10; i++) {
            // int k = 4;
            System.out.println(i);
            }
  
        // System.out.println(i); 从这里报错发现 i 不存在于 for 循环外
        // System.out.println(k); 同时 for 循环内的声明 k 也不存在于循环外，while 也是如此

        // 这里这个i=5是受限制于 i<5 导致5不会打印
        for( int i = 5; i < 5; i++) {
            System.out.println(i);
            }

        // 值得注意的是，这里输出结果为7，21，34，46，57，67，76，84，91，97
        // 这代表着我 for 循环下，步长（ increment ）是可以变化的
        int a =15;
        for( int i = 7; i < 100; i=i+a) {
            System.out.println(i);
            a =a -1;
            }
        System.out.println(a);  

        // int a =12;
        // System.out.println(a);   
        
        for(int i = 0; i <= 3; i++) {
            // loop the ith variable from 0 to 3
            for(int j = 8; j >= 6; j--) {
            // loop the jth variable from 8 to 6
                System.out.println(i + " , " + j);
            }
        }
            
        for(int i = 0; i < 8; i++) {
            double rand = (Math.random() * 6) + 1;
            // 向下取整
            int dice = (int) rand;
            System.out.println("Result is " + dice);
        }
    }
}
