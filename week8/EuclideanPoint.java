package week8;

public class EuclideanPoint {
    private double x;
    private double y;
    
    public EuclideanPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public EuclideanPoint() {
        this(0.0, 0.0);
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

    // CW1 #6.1 SET COORDINATES
    public void setCoordinates(double x, double y) {
        this.x=x;
        this.y=y;

    }

    // CW1 #6.2 DISTANCE TO
    public double distanceTo(EuclideanPoint otherPoint) {
        double d =(this.x-otherPoint.x)*(this.x-otherPoint.x)+(this.y-otherPoint.y)*(this.y-otherPoint.y);
		d = Math.pow(d,0.5);
		return d;
    }


    public static void main(String[] args) {
        // Creating two instances of EuclideanPoint
        EuclideanPoint point1 = new EuclideanPoint(3.5, 5.2);
        EuclideanPoint point2 = new EuclideanPoint();

        // Setting coordinates of point 2 via instance method
        System.out.println(point2.getX());
        System.out.println(point2.getY());
        point2.setCoordinates(7.0, 8.5);
        System.out.println(point2.getX());
        System.out.println(point2.getY());

        // Calculating and displaying the distance between the points
        double distance = point1.distanceTo(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);
    }

}
