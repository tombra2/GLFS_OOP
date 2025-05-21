package at.htl.points;

public class Point2d {
    private double x;
    private double y;

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2d() {
        this.x = 0;
        this.y = 0;
    }
    public double distance(Point2d p){

        return Math.abs(Math.sqrt(Math.pow(p.x-this.x,2)+(Math.pow(p.y-this.y,2 ))));

    }

    public static double distance(Point2d a,Point2d b){

        return Math.abs(Math.sqrt(Math.pow(a.x-b.x,2)+(Math.pow(a.y-b.y,2 ))));
    }
    public double getDistanceToCenter(){

        return Math.abs(Math.sqrt(Math.pow(this.x,2)+(Math.pow(this.y,2))));
    }
    public boolean samePosition(Point2d p){
       if (distance(p) < 0.0001){
           return true;
       } else {
           return false;
       }
    }

    public static Point2d [] sortedByX(Point2d [] points){
        Point2d [] arr = new Point2d[points.length];
        for (int i = 0; i < points.length; i++) {

            if(points[i].x>points[i+1].y){

            }
        }

        return arr;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void translate(int deltax , int deltay){
       this.x += deltax;
       this.y += deltay;
}

    @Override
    public String toString() {
        return String.format("P(%.2f|%.2f)",this.x,this.y);
    }
}
