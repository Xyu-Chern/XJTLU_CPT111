
public class SumOfSeries {
    public static void main(String[] args) {
        String secretMessage = escapeRoomDecrypt("QDTQSOBTQILCSQFLK", "SECRET");
        System.out.println(secretMessage);
    }
    
    public static String check_double(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(Character.toString(c)) == -1) {
                result+=c;
            }
        }
        return result;
    }
     
    public static String escapeRoomDecrypt(String str1,String str2){
        String m= "";
        str2=check_double(str2);
        str2=check_double(str2+"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        for (int i=0;i<str1.length();i++){
            char p=(char)('A'+str2.indexOf(str1.charAt(i)));
            m=m+p;
        }
        return m;
    }
}

    
 
    
    
    

