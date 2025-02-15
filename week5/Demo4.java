

public class Demo4 {
    public static void main(String[] args){
       
        //1 char
        char smallA = 'a';
        smallA =Character.toUpperCase(smallA);
        System.out.println(smallA);//A
       
        char firstLetter = 'A';
        System.out.println(Character.isLetter(firstLetter)); // true
        System.out.println(Character.isUpperCase(firstLetter)); // true
        System.out.println(Character.isLowerCase(firstLetter));// false
        firstLetter = Character.toLowerCase(firstLetter);
        System.out.println(firstLetter);//a
        String oneLetterStr = Character.toString(firstLetter);
        System.out.println(oneLetterStr);//a

        char five = '5';
        char newLine = '\n';
        System.out.println(Character.isDigit(five)); // true
        System.out.println(Character.isWhitespace(newLine)); // true


        // 2 string

        // the primitive data types: byte, short, int, long, float, double, boolean, char
        // arrays and String, is not a primitive type but rather a reference type
        String m ="sfsfsd";
        System.out.println(m);

        // String is a data type but also a class
        String cosmo= new String("Halloween");
        System.out.println(cosmo);
        // When we declare a variable of any reference type such as String, 
        // Java allocates a box of 64 bits, no matter what type of object
        // the 64-bit box contains not the data about the string,
        // but instead the address of the string in memory
        int len = cosmo.length();
        System.out.println(len);//9

        String s = "";
        int len_s = s.length();
        System.out.println(len_s);//0

        String cosmo1 = "hallo" + "ween";
        String bang = "bang";
        String exclamation = "!!";
        String makima = bang + exclamation;
        System.out.println(cosmo1);        // halloween
        System.out.println(makima);        // bang!!

        String nameLetter = "Halloween";
        String ss1 = nameLetter.substring(1);
        String ss2 = nameLetter.substring(2);
        // not including the end index
        String ss3 = nameLetter.substring(1,5);
        String ss4 = nameLetter.substring(2,7);
        String ss5 = nameLetter.substring(0,9);
        // H a l l o w e e n  
        // 0 1 2 3 4 5 6 7 8
        System.out.println(ss1); //alloween 
        System.out.println(ss2); //lloween
        System.out.println(ss3); //allo
        System.out.println(ss4); //llowe
        System.out.println(ss5); //Halloween

        for (int i = 0; i < nameLetter.length(); i++) {
            System.out.println(nameLetter.charAt(i));//用于获取字符串中指定索引的字符。
            }
        
        // returns the index number where the target string is first found
        int a = nameLetter.indexOf("allo");
        int b = nameLetter.indexOf("e");
        int c = nameLetter.indexOf("allO");
        int d = cosmo.lastIndexOf("e");
        System.out.println(a);//1
        System.out.println(b);//6
        System.out.println(c);//-1 if the target is not found
        System.out.println(d);//7

        int e = nameLetter.indexOf("l",2);
        int f = nameLetter.indexOf("l",3);
        int g = nameLetter.lastIndexOf("l",2);
        System.out.println(e);//2
        System.out.println(f);//3 这是从左到右找
        System.out.println(g);//2 这是从右到左找从index 2 -->1-->0 所以不会输出3



        System.out.println(nameLetter.equals("Halloween"));//true
        System.out.println(nameLetter.equals("halloween"));//false
        System.out.println(nameLetter.equalsIgnoreCase("halloween"));//true

        System.out.println(nameLetter.isEmpty());//false
        System.out.println(nameLetter.contains("lowes"));//false
        System.out.println(nameLetter.contains("lowe"));// true
        System.out.println(nameLetter.startsWith("Hal"));//true
        System.out.println(nameLetter.endsWith("ween"));//true

        System.out.println(nameLetter.toUpperCase());//HALLOWEEN
        System.out.println(nameLetter);// Halloween
        System.out.println(nameLetter.toLowerCase());//halloween
        System.out.println(nameLetter);// Halloween


            


    }
    
}
