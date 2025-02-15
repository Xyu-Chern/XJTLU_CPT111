package week11;

public class Cat extends Animal{
    private String name ;
    private String type ;

    public Cat(String name){
        super(name);
        this.type="Type:Cat";
    }
    public String getName(){
        return this.name;
    }
    
    public String makeSound(){
        return this.type+" ,"+super.makeSound()+"MiaoMiao !";
    }
}
