import java.util.Arrays;

public class Demo5 {
    public static String capitalParen(String str) {
        int left = str.indexOf("(");
        int right = str.indexOf(")");
        String sub = str.substring(left + 1, right);
        sub = sub.toUpperCase();
        String result = str.substring(0, left + 1) + sub +
        str.substring(right);
        return result;
    }
            
    public static void main(String[] args){
        String a ="(asdsd)";
        System.out.println(capitalParen(a));//(ASDSD)

        String cosmo = "  ha haa halloween  ";
        cosmo = cosmo.trim();
        System.out.println(cosmo);//ha haa halloween
        
        cosmo = cosmo.replaceAll("h", "H");
        System.out.println(cosmo);//Ha Haa Halloween

        String[] words = cosmo.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);         
        }

    }
    
    
}
