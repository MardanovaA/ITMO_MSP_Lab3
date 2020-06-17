public class Area {
    double r;
    public Area(double radius) {
        this.r = radius;
    }
    public boolean isInArea(double x, double y) {
        return firstSegment(x, y) || secondSegment(x, y) || thirdSegment(x, y);
    }
    // x^2 + y^2 = r


    private boolean firstSegment(double x, double y) {
        if (inInterval(x, 0.0, r) && inInterval(y, 0.0, Math.sqrt(r - x*x))) {
            return true;
        }
        else {
            return false;
        }
    }
	
	
	
	
    // y = x/2 + r/2
    private boolean secondSegment(double x, double y) {
        if (inInterval(x, -r, 0.0) && inInterval(y, -0.5*x-0.5*r, 0.0)) {
            return true;
        }
        else {
            return false;
        }
    }
    private boolean thirdSegment(double x, double y) {
        if (inInterval(x, 0.0, 0.5*r) && inInterval(y, -r, 0.0)) {
            return true;
        }
        else {
            return false;
        }
    }
    // lol ub (actually upper bound)
    private static boolean inInterval(double val, double lb, double ub) {
        if (val >= lb && val < ub) {
            return true;
        }
        else {
            return false;
        }
    }
}


