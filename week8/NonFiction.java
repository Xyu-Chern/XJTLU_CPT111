package week8;

public class NonFiction extends Book{
    private String type;

    public NonFiction(String author,int num,String title){
        super(author,num,title);
        this.type="nonfiction";
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return "The "+getType()+"book is "+getTitle()+",its author's name is "+getAuthor()+",which has "+getNum() +" books in libaray";
    }

}