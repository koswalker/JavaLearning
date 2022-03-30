package Exercise32;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
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

    public double distance (){
        double dist = 0;
        dist = Math.sqrt((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));
        return dist;
    }

    public double distance(int x, int y){
        double dist = 0;
        int Bx = x;
        int By = y;

        dist = Math.sqrt((Bx-this.x)*(Bx-this.x)+(By-this.y)*(By-this.y));

        return dist;
    }

    public double distance(Point ob) {
        double dist = 0;
        dist = Math.sqrt((ob.x-this.x)*(ob.x-this.x)+(ob.y-this.y)*(ob.y-this.y));

        return dist;
    }
}
