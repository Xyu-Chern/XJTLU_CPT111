public class e1{
    public static boolean isValidID(String id) {

        int sum =0;
        for (int i =0; i< id.length()-1;i++){
            if (Character.isDigit(id.charAt(i))==true){
                sum =sum + Integer.parseInt(Character.toString(id.charAt(i)));
            }
        }
 
        if (id.charAt(id.length()-1)=='X'){
            return sum %11==10; 
        }  
        return sum %11== Integer.parseInt(Character.toString(id.charAt(id.length()-1)));  
    }


    public static String sandwichFillings(String input) {
        if (input.indexOf("bread", 0)!=-1&&input.indexOf("bread", input.indexOf("bread", 0)+4)!=-1){
            return input.substring(input.indexOf("bread", 0)+5,input.lastIndexOf("bread", input.length()-1));
        }
        return "none";
    }

    public static int calcNetIncome(String input) {
        input ="ll"+input + "ll";
        int sum =0;
        int point =-1;
        for (int i=0;i<input.length();i++){
            if (input.charAt(i) =='-'){
                i++;
                int m =0;
                
                while (Character.isDigit(input.charAt(i))){
                    m =10*m+Integer.parseInt(Character.toString(input.charAt(i)));
                    i++;
                }
                i--;
                point =i;
                sum = sum -m;
            }

            int k =0;
            if (Character.isDigit(input.charAt(i))&&i!=point){
                while (Character.isDigit(input.charAt(i))){
                    k =10*k+Integer.parseInt(Character.toString(input.charAt(i)));
                    i++;
                }
                i--;
            }
            sum =sum +k;
 
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(isValidID("THMBB7092WD114221"));
        System.out.println(isValidID("A001-606X-17X"));
        System.out.println(sandwichFillings("breadtunabread"));
        System.out.println(sandwichFillings("chipsbreadtunasalad"));

        int netIncome = calcNetIncome("salary 15000yuan bonus2000 rent -1000Y");
        System.out.println("Net Income = " + netIncome);

        int netIncome1 = calcNetIncome("-6-6-6,6-6");
        System.out.println("Net Income = " + netIncome1);



    }

}


