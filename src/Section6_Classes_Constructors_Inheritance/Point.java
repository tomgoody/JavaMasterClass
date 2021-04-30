package Section6_Classes_Constructors_Inheritance;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        return;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public  double distance(){
        this.x = 0;
        this.y = 0;
        return distance(0,0);
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }

    public double distance(Point point){
        //double distance = distance(this.x, this.y);
        return distance(point.x, point.y);
    }
}
