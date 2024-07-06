public class Lab6_4 {
    private double x;
    private double y;    
    public Lab6_4() {
        this.x = 0;
        this.y = 0;
    }
    public Lab6_4(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double distance(Lab6_4 otherPoint) {
        double dx = this.x - otherPoint.getX();
        double dy = this.y - otherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public static void main(String[] args) {
        Lab6_4 point1 = new Lab6_4(1, 1);
        Lab6_4 point2 = new Lab6_4(4, 5);
        
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
        System.out.println("Distance from point1 to coordinates (2,3): " + point1.distance(2, 3));
    }
}