package week8;

public class ThreeDimPoint extends EuclideanPoint {
    
    private double z;
    
    public ThreeDimPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    
    public double getZ() {
        return z;
    }
    
    // CW1 #8.1 Overriding DistanceTo
    @Override
    public double distanceTo(EuclideanPoint otherPoint) {
        
        // if otherPoint is an instance of ThreeDimPoint,
        // firstly cast it into an instance of ThreeDimPoint
        if (otherPoint instanceof ThreeDimPoint) {
            
            ThreeDimPoint threeDPoint = (ThreeDimPoint) otherPoint;
            // System.out.println(threeDPoint.getZ());
            double d =super.distanceTo(otherPoint);
            // System.out.println(d);
            d=d*d+(getZ()-threeDPoint.getZ())*(getZ()-threeDPoint.getZ());
            d=Math.sqrt(d);
            return d;
            
        } 
        else {
            
            // Complete the code by calculating distance of 2D Euclidean Points
            // Hint: call the overridden method of superclass
            
            return super.distanceTo(otherPoint);
        }
    }
    
    public static void main(String[] args) {
        
        ThreeDimPoint point1 = new ThreeDimPoint(1.0, 2.0, 3.0);        
        ThreeDimPoint point2 = new ThreeDimPoint(3.0, 5.0, 9.0);        
        System.out.println(point1.distanceTo(point2)); // 7.0
        
        EuclideanPoint point3 = new EuclideanPoint(8.0, 26.0);        
        System.out.println(point1.distanceTo(point3)); // 25.0
        
    }
}
