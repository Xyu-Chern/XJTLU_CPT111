package week8;

public class Pillar extends Swordsman {
    // If the instance variable will never be changed after it is initialized,we can declare it to be final:
    private final int numDemonsKilled;
    private String type;
    
    public Pillar(String name) {
        super(name);
        this.numDemonsKilled = super.getnumDemonsKilled();//如果是private final int numDemonsKilled;,这里必须赋值否则报错，不要想着原本父类有相同变量就不需要，这个继承只是在父类赋值一个变量，取名相同，和现在的没有任何关系
        this.type ="general";
    }

    public Pillar(String name, int numDemonsKilled,String type) {
        // super(name, numDemonsKilled);原本Sword没有接受这种输入的继承的就不能这么写
        super(name);
        this.numDemonsKilled = numDemonsKilled;
        this.type =type;

    }
    
    @Override
    public int getnumDemonsKilled(){//这会覆盖原本Sword写的getnumDemonsKilled()方法
        return numDemonsKilled;
    }

    //  @Override编译器会检查该方法是否真的重写了父类中的方法，如果没有正确地重写，编译器将会报错
    @Override
    public int attackDamage() {//If you declare an instance method to be final, it cannot be overridden
        return 1000 + 100 *getnumDemonsKilled();
    }
        
    // 使用super关键字调用父类的方法
    public int getnumDemonsKilledFromParent(){
        return super.getnumDemonsKilled(); 
    } 

    @Override
    public String toString() {
        return type + " Pillar " + getName() + " has killed " +getnumDemonsKilled() + " demons";
    }

    public static void main(String[] args) {
        Pillar kyojuro1 = new Pillar("Kyojuro");
        System.out.println(kyojuro1.getName());

        Pillar kyojuro2 = new Pillar("Kyojuro", 1,"fire");
        System.out.println(kyojuro2.getnumDemonsKilled());
        System.out.println(kyojuro2.getnumDemonsKilledFromParent());
        System.out.println(kyojuro2.attackDamage());
        System.out.println(kyojuro2.toString());

        // Java中的多态性（Polymorphism）特性。
        // 在Java中，子类的对象可以赋值给父类类型的变量。这是因为子类继承了父类的所有属性和方法，并且还可以有自己特有的属性和方法。因此，当你使用Swordsman类型的变量来引用一个Pillar对象时，编译器会认为这是合法的，因为Pillar是Swordsman的子类，它继承了Swordsman的所有特性。
        // 在运行时，实际调用的是Pillar类中的方法，而不是Swordsman类中的方法。这就是多态的表现，即同样的代码在不同的对象上会产生不同的行为。
        // 这种特性使得代码更加灵活，能够适应不同的对象类型。但需要注意的是，尽管kyojuro3它实际指向的是一个Pillar对象，但他类型是Swordsman因此只能访问Swordsman中有定义的属性和方法，而无法直接访问Pillar特有的属性和方法，除非进行强制类型转换。

        Swordsman kyojuro3 = new Pillar("Kyojuro", 1, "Fire");
        //*****值得注意的是当子类将方法重写后，利用多态性定义的父类调用的方法是重写后的方法不是原始方法！******
        System.out.println(kyojuro3.attackDamage());
        System.out.println(kyojuro3);
        // System.out.println(kyojuro3.getnumDemonsKilledFromParent());不是父类方法不会成立
     
    }
}

