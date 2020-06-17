

public class Point {
    double x;
    double y;
    static Area area;
    public Point(double point_x, double point_y, double radius) {
        if (radius < 0.0) {
            throw new IllegalArgumentException("Radius must not be negative number");
        }

        area = new Area(radius);
        x = point_x;
        y = point_y;
    }
    public static Area getArea(){
        return area;
    }
	
    public boolean isInArea(){
        return area.isInArea(x,y);
    }
}



