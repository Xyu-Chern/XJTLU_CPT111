public class arithmaetic {
    public static void main(String[] args){
        System.out.println(3+4);
        System.out.println(3-4);

        // 整数参与计算最后结果只能是整数
        System.out.println(3/4);
        System.out.println(46/4);

        // 只有小数参与计算时才会得到小数，但部分情况得到的数据不精确
        System.out.println(10.0/4);
        // 如下列结果为3.33333335
        System.out.println(10.0/3);

        System.out.println(3*4);
        System.out.println(46.6%4.32);

        String str1 = "Welcome";
        System.out.println(computeLetter('e', str1));

        String str2 = "Good Job";
        System.out.println(computeLetter('o', str2));

    }
    public static int computeLetter(char c, String input) {
        return computeLetterhelper(c, input,0,input.length()-1);
    }

    public static int computeLetterhelper(char c, String input,int sum,int i ) {
        if (i>=0){
            if(c==input.charAt(i)){
                return computeLetterhelper(c, input,sum+1,i-1);
            }
            else{
                return computeLetterhelper(c, input,sum,i-1);                
            }
        }
        return sum;
    }
    
}
