package week6;

public class ColorHSB {
    
    private int hue;
    private int saturation;
    private int brightness;


    public ColorHSB(int h, int s, int b) {
        this.hue=h;
        this.saturation=s;
        this.brightness=b;
		
		
		
    }

    // Lab Exercise #6.2
    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        return "("+hue+", "+saturation+", "+brightness+")";
    }

    // // Lab Exercise #6.3
    // // Is this color in grayscale?
    public boolean isGrayscale() {
        if (saturation ==0||brightness==0) {
            return true;    
        }
		return false;
    }

    // // Lab Exercise #6.4
    // // Returns the squared distance between two colors.
    // //     min{ (h1−h2)^2, (360−|h1−h2|)^2 } + (s1−s2)^2 + (b1−b2)^2
    public int squareDist(ColorHSB that) {
        double k =Math.pow((this.hue-that.hue)*(this.hue-that.hue),0.5);
        int m = (int) k;
        // System.out.println(m);
        if (m*m>(360-m)*(360-m)){
            return (360-m)*(360-m)+(this.saturation-that.saturation)*(this.saturation-that.saturation)+(this.brightness-that.brightness)*(this.brightness-that.brightness);
        }
        return m*m+(this.saturation-that.saturation)*(this.saturation-that.saturation)+(this.brightness-that.brightness)*(this.brightness-that.brightness);
		
		
		
    }
    
    public static void main(String[] args) {
        // ColorHSB green = new ColorHSB(100, 100, 50);
        // ColorHSB orange = new ColorHSB(25, 100, 100);
        // ColorHSB gray = new ColorHSB(0, 0, 50);
        
        // System.out.println(green);
        
        // System.out.println(orange.isGrayscale());
        // System.out.println(gray.isGrayscale());
        
        // int distGreenOrange = green.squareDist(orange);
        // System.out.println(distGreenOrange);
        // System.out.println(gray.squareDist(orange));

        ColorHSB green = new ColorHSB(100, 100, 50);
        ColorHSB orange = new ColorHSB(25, 100, 100);
        ColorHSB gray = new ColorHSB(0, 0, 50);
                
        System.out.println(green);
                
        System.out.println(orange.isGrayscale());
        System.out.println(gray.isGrayscale());
                
        int distGreenOrange = green.squareDist(orange);
        System.out.println(distGreenOrange);
        System.out.println(gray.squareDist(orange));

        // String s ="ads:Ada";

        // System.out.println(s.split(":")[1]);
    }
    
}
