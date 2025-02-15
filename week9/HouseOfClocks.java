package week9;
public class HouseOfClocks {
    
    // A house of clocks stores all its clocks in an array of Clock objects
    private Clock[] clocksCollection;
    // the number of clocks
    private int numClocks;
    
    
    public HouseOfClocks(int numClocks) {
        this.numClocks=numClocks;
        if (numClocks>24||numClocks<1){
            throw new IllegalArgumentException("!");

        }else{
        clocksCollection=new Clock[numClocks];
            for (int i=0;i<numClocks;i++){
                clocksCollection[i]=new Clock(i,0);
            }
        }
    }
    
    // Exercise #9.6
    // creates a house of clocks which has a collection of four types of clocks in Week 9:
    // nClock, nAlarm, nCuckoo, nHalloween number of Clock, AlarmClock, CuckooClock, and HalloweenClock objects, respectively
    // all number of clock of any types must be between 0 and 24, inclusive;
    // and the total number of clocks must be between 1 and 24, inclusive; 
    // and throws IllegalArgumentException, otherwise
    // the first clock must start at 00:00, the second clock at 01:00, and so on
    // the alarm time of the AlarmClock objects must be 1 hour after the starting time
    // for example,
    // if nClock = 1, nAlarm = 1, nCuckoo = 1, nHalloween = 1,
    // it stores total of 4 clocks where the first clock at index 0 is a Clock object starts at 00:00,
    // the second clock at index 1 is an AlarmClock object starts at 01:00
    // the third clock at index 2 is a CuckooClock object starts at 02:00
    // and the fourth clock at index 3 is a HalloweenClock object starts at 03:00

    public HouseOfClocks(int nClock, int nAlarm, int nCuckoo, int nHalloween) {
        if (nClock+nAlarm+nCuckoo+nHalloween>24||nClock+nAlarm+nCuckoo+nHalloween<1){
            throw new IllegalArgumentException("!");

        }
        else if(nAlarm>24||nAlarm<0){
            throw new IllegalArgumentException("!");
        }
        else if(nCuckoo>24||nCuckoo<0){
            throw new IllegalArgumentException("!");
        }
        else if(nHalloween>24||nHalloween<0){
            throw new IllegalArgumentException("!");
        }
        else{
            this.numClocks=nClock+nAlarm+nCuckoo+nHalloween;
            clocksCollection=new Clock[numClocks];
            for (int i=0;i<nClock;i++){
                clocksCollection[i]=new Clock(i,0);
            }
            for (int i=nClock;i<nClock+nAlarm;i++){
                clocksCollection[i]=new AlarmClock(i,0,i,1);
            }
            for (int i=nClock+nAlarm;i<nClock+nAlarm+nCuckoo;i++){
                clocksCollection[i]=new CuckooClock(i,0);
            }
            for (int i=nClock+nAlarm+nCuckoo;i<numClocks;i++){
                clocksCollection[i]=new HalloweenClock(i,0);
            }
        }

    }
    
    
    // // Exercise #9.7
    // // Calls the tick method of the clock in the collection at index clockIndex.
    // // Throw an IndexOutOfBoundsException if the clockIndex is not valid,
    // //     and use the message "No clock stored at index " followed by the invalid index. 
    public void tick(int clockIndex) {

        if(clockIndex >=numClocks||clockIndex<0){
            throw new IndexOutOfBoundsException("No clock stored at index "+clockIndex);
        }else{
            clocksCollection[clockIndex].tick();
        }
    }
    
    

    public void printClocks() {
        for (int i = 0; i < numClocks; i++) {
            System.out.println(clocksCollection[i]);
        }
    }
    
    
	// Test Client
    public static void main(String[] args) {
        

        HouseOfClocks hc1 = new HouseOfClocks(3);
        hc1.printClocks();                       

        try {
            HouseOfClocks hc2 = new HouseOfClocks(100);
            System.out.println(hc2);
        } catch (IllegalArgumentException e) {
            System.out.println("Too much clocks to store!");
        }
        
        // Test Case Tick #1
        hc1.tick(0);
        hc1.tick(0);
        hc1.tick(1);
        hc1.printClocks();                       // 00:02↵01:01↵02:00
        
        // Test Case Tick #2
        try {
            hc1.tick(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());  // No clock stored at index 100
        }
        // Test Case Second Constructor and Polymorphic Tick
        HouseOfClocks hc3 = new HouseOfClocks(1, 1, 1, 1);
        hc3.printClocks();              // 00:00↵01:00↵02:00↵03:00
        
        for (int i = 0; i < 60; i++) {
            hc3.tick(1);                // Beep beep beep beep!
        }
        for (int i = 0; i < 60; i++) {
            hc3.tick(2);                // Cuckoo!↵Cuckoo!↵Cuckoo!
        }
        for (int i = 0; i < 3; i++) {
            hc3.tick(3);                // Halloween!
        }
        try {
            HouseOfClocks hc4 = new HouseOfClocks(1, 1, 1, -1);
            System.out.println(hc4);
        }
        catch (IllegalArgumentException e) {
            System.out.println("No negative arguments!");
        }
        
    }
    
}
