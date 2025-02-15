package week9;
public class HalloweenClock extends Clock {
    
    private static int numOfTicks = 0;
    
    public HalloweenClock(int h, int m) {
        super(h,m);
		
    }
    
    @Override
    public void tick() {
        super.tick();
        numOfTicks++;
        if (numOfTicks==3){
            System.out.println("Halloween!");
            numOfTicks=0;
        }
    }
    
    public static void main(String[] args) {
        HalloweenClock hc1 = new HalloweenClock(1, 0);
        HalloweenClock hc2 = new HalloweenClock(2, 0);
        hc1.tick();
        hc2.tick();
        hc2.tick(); 
        
        HalloweenClock hc3 = new HalloweenClock(3, 30);
        hc1.tick();
        hc2.tick();
        hc3.tick();  
        System.out.println(hc3); 
    }
	
}
