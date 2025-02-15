public class localvariable {

    public static int addTwoNumbers(int num1, int num2) {
            int result = num1 + num2;
            return result;
        }
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int result = 10;
        addTwoNumbers(num1, num2);
        System.out.println(result); //10
        // 如何理解这里答案是10，我们先把 int result = 10 注释，发现无法print result， 方法里的result是局部变量，不影响main 函数，否则为什么这个add函数需要赋值给别人，不直接输出result
    }
}
