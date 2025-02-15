package week11;

public class Animal {
    private String name;
    private String voice ;

    public Animal(String name){
        this.name=name;
        this.voice="The animal is making a voice :";
    }

    public String getName(){
        return this.name;
    }
    
    public String makeSound(){
        return this.voice;
    }
    
}
