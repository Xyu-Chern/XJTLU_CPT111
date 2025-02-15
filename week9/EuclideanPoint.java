package week9;

public class EuclideanPoint {
    private double x;
    private double y;
	
	
	// CW1 #9.1 CONSTRUCTOR WITH EXCEPTION    
    public EuclideanPoint(double x, double y) {
        this.x=x;
        this.y=y;
        if (x<0||y<0){
            throw new  IllegalArgumentException("Negative input detected");
        }
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
	
	public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }	
	
    public double distanceTo(EuclideanPoint otherPoint) {
        double dist=(otherPoint.getX()-x)*(otherPoint.getX()-x)+(otherPoint.getY()-y)*(otherPoint.getY()-y);
        dist=Math.pow(dist, 0.5);
        if (dist==0){
            throw new DistanceToException("Zero distance detected");
        }else{
            return dist;
        }
    }
	

    public static void main(String[] args) {
		
		EuclideanPoint point1 = new EuclideanPoint(3.5, 5.2);
		
		try {
			EuclideanPoint point2 = new EuclideanPoint(-1.0, 6.8);
            System.out.println(point2);
		}
		catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
		
		
        EuclideanPoint point3 = new EuclideanPoint(3.5, 5.2);

        try {
			double distance = point1.distanceTo(point3);
			System.out.println("Distance between Point 1 and Point 3: " + distance);
		}
		catch (DistanceToException dte) {
			System.out.println(dte.getMessage());
		}
		
    }

}
