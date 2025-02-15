package week9;

public class Clock {
    private int hours;
    private int minutes;


    public Clock(int h, int m) {
        this.hours=h;
        this.minutes = m;
        if (hours<0 ||hours>23||minutes<0 ||minutes>59){
            throw new IllegalArgumentException("no !");
        }
	
    }

    public Clock(String s) throws IllegalArgumentException {
        if (!s.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("Invalid time format. The format should be HH:MM.");
        }

        String[] timeParts = s.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Invalid time. Time should be between 00:00 and 23:59.");
        }

        this.hours = hours;
        this.minutes = minutes;
    }

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

    public boolean isEarlierThan(Clock that){
        if (this.hours<that.hours){
            return true;
        }
        if (this.hours == that.hours && this.minutes<that.minutes){
            return true;
        }
        return false;
	
    }

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
        if (delta<0){
            throw new  IllegalArgumentException("Illegal negative delta "+delta);
        }else{
            for (int i =1;i<=delta;i++){
                this.mas();
            }
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

        Clock clock3 = new Clock("0:30");        
        System.out.println(clock3);

        try {
            Clock clock4 = new Clock("2400");
            System.out.println(clock4);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 2!");
        }
		
    }
}
