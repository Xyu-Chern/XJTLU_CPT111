package week9;
public class CuckooClock extends Clock {
    
    public CuckooClock(int h, int m) {
        super(h,m);
    }
    
    
    // Exercise #8.5
    // Adds 1 minute to the time on this Cuckoo clock.
    // In addition,  it prints "Cuckoo!" at the start of every hour
    // It prints one time for each hour
    // Whether it is morning or night does not change the number of times it prints
    // For example, for 14:00, it prints "Cuckoo!" two times;
    //              and for 00:00 and 12:00, it prints "Cuckoo!" twelve times.
    @Override
    public void tick() {
		super.tick();
        if (getMinutes()==0){
            if(getHours()!=12&&getHours()!=0){
                for (int i=1;i<=getHours()%12;i++){
                    System.out.println("Cuckoo!");
                }
            }
            else{
                for (int i=1;i<=12;i++){
                    System.out.println("Cuckoo!");
                }
            }
        }
    }
    
    
    // Test Client
    public static void main(String[] args) {
        CuckooClock cc1 = new CuckooClock(0, 58);
        cc1.tick();
        cc1.tick();  // Cuckoo!
        System.out.println(cc1);  // 01:00
        
        CuckooClock cc2 = new CuckooClock(13, 59);
        cc2.tick();  // Cuckoo! 
		             // Cuckoo!
		
    }
}