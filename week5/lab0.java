// import java.util.Arrays;

public class lab0 {
    public static void main(String[] args){
        System.out.println(repeatString("abc", 3));
        System.out.println(repeatString("abcd", 1));
        System.out.println(repeatString("abcd", 0));

        System.out.println(countQuestionMark("ab???ab"));
        System.out.println(countQuestionMark("?abc?"));
        System.out.println(countQuestionMark(""));

        System.out.println(checkMembership("A-123-456-23A"));
        System.out.println(checkMembership("A-187-267-111"));
        System.out.println(checkMembership("c-542-223-11G"));
        System.out.println(checkMembership("A-187-267+111"));
        System.out.println(checkMembership("A-187-11G"));
        System.out.println(checkMembership("E-123-456-23A"));
        System.out.println(checkMembership("b-555-88-123T"));

        // char a;
        // System.out.println(a);
        // 在Java中，如果未对char类型的变量进行初始化，则其默认值为0。这是因为char类型是一个基本数据类型，其存储大小为16位或2个字节。
        // 在Java中，所有的基本数据类型都有一个默认值。如果在声明变量时没有给定某个基本数据类型的变量一个初始值，则该变量将被自动初始化为其默认值。char类型作为基本数据类型也遵循这一规则。
        // 对于char类型，它的默认值为0，即字符'\u0000'，这也是在char类型的范围内的一个有效字符。Unicode值'\u0000'代表空字符，因此对于未初始化的char类型变量，Java将其默认设置为空字符。
        // 需要注意的是，在字符串中使用空字符可能会导致一些问题，因此在使用char类型变量之前最好显式地对其进行初始化，以确保它们具有所需的值。

    }
    

    public static String repeatString(String a ,int b){
        String sum ="";
        if (b==0){
            return "";
        }
        else{
            for (int i =1;i<=b;i++){
                sum = sum +a;
            }
        }
        return sum ;
    }

    public static int countQuestionMark(String a){
        int sum =0;
        for (int i =0; i <=a.length();i++){
            int m = a.indexOf("?",i);
            // System.out.println(m);
            if (m ==-1){
                return sum;
            }
            else{
                i=m;
                sum++;
            }
        }
        return sum;
    }

    public static int countQuestionMark1(String a){
        int sum =0;
        for (int i =0; i <=a.length();i++){
            int m = a.indexOf("-",i);
            // System.out.println(m);
            if (m ==-1){
                return sum;
            }
            else{
                i=m;
                sum++;
            }
        }
        return sum;
    }
    public static boolean isNumeric(String str){ 
        for (int i = str.length();--i>=0;){   
         if (!Character.isDigit(str.charAt(i))){ 
          return false; 
         } 
        } 
        return true; 
      } 

    public static boolean isLetterBetweenAandT(char c) {
        return c >= 'A' && c <= 'T';
    }
    


    public static boolean checkMembership(String a){
        if (a.length()!=13){
            return false;
        }
        else{
            if (countQuestionMark1(a)!=3){
                return false;
            }
            else{
                char uppera=Character.toUpperCase(a.charAt(0));
                if (uppera=='A'||uppera=='B'||uppera=='C'||uppera=='D'){
                    String[] words = a.split("-");
                    if ( isNumeric(words[1])==true&&isNumeric(words[2])==true&&words[1].length()==3&&words[2].length()==3&&words[3].length()==3&&isLetterBetweenAandT(words[3].charAt(2))==true){
                        return true;
                    }
                    else{
                        return false;
                    }
                }  
                else{
                    return false;
                }
                
 
            }
        }
    }

    
    

}
