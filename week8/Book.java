package week8;

public class Book {
    
    private String author;
    private int num;
    private String title;
    
    public Book(String author,int num,String title) {
        this.author = author;
        this.num = num;
        this.title = title;

    }
    public int getNum() {
        return num;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
       
    public String toString() {
        return "The book is "+getTitle()+",its author's name is "+getAuthor()+",which has "+getNum() +" books in libaray";
    }



}
