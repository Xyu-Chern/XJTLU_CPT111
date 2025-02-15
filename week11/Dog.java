package week11;

public class Dog extends Animal{
    private String name ;
    private String type ;

    public Dog(String name){
        super(name);
        this.type="Type:Dog";
    }
    public String getName(){
        return this.name;
    }
    
    public String makeSound(){
        return this.type+" ,"+super.makeSound()+"WangWang !";
    }
}
