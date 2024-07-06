import java.lang.Math;

public class MyPoint {
    protected double x;
    protected double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}

public class ThreeDPoint extends MyPoint {
    private double z;

    public ThreeDPoint() {
        this(0, 0, 0);
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double distance(MyPoint other) {
        if (other instanceof ThreeDPoint) {
            ThreeDPoint point = (ThreeDPoint) other;
            return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2) + Math.pow(this.z - point.z, 2));
        } else {
            throw new IllegalArgumentException("Cannot calculate distance between 3D point and 2D point");
        }
    }

    public static void main(String[] args) {
        ThreeDPoint point1 = new ThreeDPoint(0, 0, 0);
        ThreeDPoint point2 = new ThreeDPoint(10, 30, 25.5);

        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
    }
}