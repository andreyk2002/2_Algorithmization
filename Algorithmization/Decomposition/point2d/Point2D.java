package by.epam_tc.step1.t2.type4.point2d;

public class Point2D {

    Point2D(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y + ")";

    }
    private double x;
    private double y;
}
