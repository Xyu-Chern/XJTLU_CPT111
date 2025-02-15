public class Different_decimal {
    public static void main(String[] args){
        // 十六进制
        System.out.println(0x11);
        // 八进制
        System.out.println(011);
        // 二进制
        System.out.println(0b11);
        // 十进制
        System.out.println(11);
        
        byte a= 127;
        System.out.println(a);
        a=-128;
        System.out.println(a);

        // 不能重新定义a的类型
        // short a = 122;
        // System.out.println(a);

        short b = 127;
        System.out.println(b);

        // char 命名的是字符，char类型可以用来命名表示任何Unicode字符的变量。它可以用来命名字母、数字、标点符号和其他各种特殊字符 比如 char d = '5'，以下为错误示例
        // char d= "aa";
        // System.out.println(d);
        char c= 'a';
        System.out.println(c);

        // 注意一下必须双引号
        // String d= 'a';
        // System.out.println(d);
        String d= "a";
        System.out.println(d);

        // True ,False 必须小写,变量名大小写没有关系
        boolean M= true;
        System.out.println(M);

        boolean m= false;
        System.out.println(m);
        
        // Long和float 后面要加L和F大小写均可 前面声明long和float大小写均可
        long n=99999l;
        // Long n=99999l;
        System.out.println(n);

        Float z=1.2f;
        // float z=1.2f;
        System.out.println(z);

        // 字符 'a' 会被自动转换为对应的Unicode值，也就是97。接下来，将 -1 和 97 相加，得到96。
        System.out.println(a+b+c);

        
    }

    // 在代码中不能出现了两个相同签名的main方法。Java程序只能有一个入口点（即一个main方法），否则编译器将无法识别哪个main方法应该作为程序的入口点，并且会报告错误

    /*public static void main(String[] args){
        // 十进制
        System.out.println(0x11);
        // 八进制
        System.out.println(011);
        // 二进制
        System.out.println(0b11);
        // 十进制
        System.out.println(11);
    
        short a = 122;
        System.out.println(a);

        short b = 122;
        System.out.println(b);
    }*/
}

