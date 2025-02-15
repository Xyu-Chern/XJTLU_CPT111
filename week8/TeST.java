package week8;


public class TeST {
    
    private String author;
    private int num;
    private String title;
    
    public TeST(String author,int num,String title) {
        this.author = author;
        this.num = num;
        this.title = title;
    }
    public String toString(){
        return author+"-"+num+"-"+title;
    }
    public static void main(String[] args) {
        TeST a1=new TeST("as",12,"asd");
        System.out.println(a1);
        TeST a2=a1;
        a2.num=14;
        System.out.println(a1);
        System.out.println(a2);
        a1.num=16;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1==a2);

        
    }

}