package week8;

public class Swordsman {
    private String name;
    private boolean alive;
    private int numDemonsKilled;
    private static int numSwordsman = 4;
    public int healthPoint;
    public static final int MAX_HP = 100;
    
    public Swordsman(String name) {
        this.name = name;
        alive = true;
        numDemonsKilled = 0;
        numSwordsman++;
        healthPoint = MAX_HP;
    }
    //作用见下方print,可以直接通过类名访问，不需要创建类的实例
    
    public static int getNumSwordsman() {
        return numSwordsman;
    }

    public int getNumSwordsmanInst() {
        return numSwordsman;
    }
    public String getName() {
        return name;
    }
    public boolean getalive() {
        return alive;
    }

    public int getnumDemonsKilled() {
        return numDemonsKilled;
    }
    // public final int attackDamage()
    public int attackDamage() {
        return 10 + 5 * numDemonsKilled;
    }
       
    public String toString() {
        String alive;
        if (this.alive) 
            alive = "alive";
        else 
            alive = "dead";
        return "Swordsman " + name + " is " + alive + " and has killed " + numDemonsKilled + " demons";
    }

    public static void main(String[] args) {
        System.out.println(Swordsman.getNumSwordsman());


    } 
}


