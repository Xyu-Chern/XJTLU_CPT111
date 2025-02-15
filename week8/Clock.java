package week8;

public class Clock {
    private int hours;
    private int minutes;


    public Clock(int h, int m) {
        this.hours=h;
        this.minutes = m;
	
    }

    public Clock(String s) {
        String [] data_time= s.split(":");
        this.hours = Integer.parseInt(data_time[0]);
        this.minutes =Integer.parseInt(data_time[1]);
		
    }

    // Exercise #6.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String h_s=Integer.toString(this.hours);
        String m_s=Integer.toString(this.minutes);
        if (h_s.length()==1){
            h_s = "0"+h_s;
        }
        if (m_s.length()==1){
            m_s = "0"+m_s;
        }
        return h_s+":"+m_s;
	
    }

    // Exercise #6.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that){
        if (this.hours<that.hours){
            return true;
        }
        if (this.hours == that.hours && this.minutes<that.minutes){
            return true;
        }
        return false;
	
    }

    // Exercise #6.5
    // Adds 1 minute to the time on this clock.
    public void tick() {
        if (this.minutes!=59){
            this.minutes++;
        }
        else{
            this.minutes=0;
            this.hours++;
        }
        if (this.hours==24){
            this.hours=0;
        }
        
    }



    // Exercise #6.6
    // Adds delta minutes to the time on this clock.

    public void mas() {
        if (this.minutes!=59){
            this.minutes++;
        }
        else{
            this.minutes=0;
            this.hours++;
        }
        if (this.hours==24){
            this.hours=0;
        }
        
    }

    public void tock(int delta) {
        for (int i =1;i<=delta;i++){
            this.mas();
        }
    }

    public int getHours(){
        return hours;

    }
    public int getMinutes(){
        return minutes;
    }

    public static void main(String[] args) {
        Clock clock1 = new Clock(23, 59);
        Clock clock2 = new Clock("23:30");
		
        System.out.println(clock1);
        System.out.println(clock2);
		
        System.out.println(clock1.isEarlierThan(clock2));
		
        clock1.tick();
        clock2.tock(100);
		
        System.out.println(clock1);
        System.out.println(clock2);
		
    }
}
