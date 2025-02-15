package week12;

public class LearnSequentialHelper {
    private static String subseqHelper(String partialSubseq, String word) {
    if (word.isEmpty())
        return partialSubseq;
    else
        return subseqHelper(partialSubseq + word.charAt(0),word.substring(1))+ ","+ subseqHelper(partialSubseq, word.substring(1));
    }

    public static String subseq(String word){
        return subseqHelper("", word);
    }

    public static void  main(String[] args){
        System.out.println(subseq("abcdef"));
        String m ="ac";
        System.out.println(m.substring(2));
    }


}
