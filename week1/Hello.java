// "public" 关键字表示该方法是公有的，可以从其他类或外部访问。
// "static" 关键字表示该方法属于类本身，而不是类的实例对象。
// "void" 关键字表示该方法没有返回
// "int" 是表示整数类型的关键字
// float：用关键字 "float" 声明，占用 4 字节内存空间，精度约为 7 位小数。
// double：用关键字 "double" 声明，占用 8 字节内存空间，精度约为 15 位小数。

public class Hello {
    // static int add 其中的 int 用于指定方法的返回类型
    // 方法的返回类型是必须指定的，除非方法的返回类型是 void，它可以是基本类型（如 int、double、boolean 等）或者引用类型（如类、接口、数组等）
    // 需要声明变量类型：int a
    public static int add(int a, int b) {
        // 需要声明变量类型：int sum
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args) {
        int result = add(3, 5);
        System.out.println("Sum: "+ result);
        System.out.println("sb " );
        // 当赋值给 "float" 类型的变量时，需要在数字后面加上 "f" 或 "F" 来表示是一个浮点数。
        float num1 = 3.14f;
        double num2 = 2.71828;

        System.out.println(num1);
        System.out.println(num2);
        
    }
}
