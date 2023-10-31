package resources;

public class Point {
    int x, y;

    //constructor with no parameters
    public Point() {

    }

    //constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //set method to set x co-ordinate
    public void setX(int xField) {
        x = xField;
    }

    //set method to set y co-ordinate
    public void setY(int yField) {
        y = yField;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //method overloading
    public double distance() {
        return (Math.sqrt((this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0)));
    }

    //Method call "first.distance(second.x,second.y)" -- finds distance between
    // first object which has been initiated to (6,5)
    // and second object which has been initiated to (3,1)
    //using the implementation below
    public double distance(int x, int y){
        return (Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)));
    }

    public double distance(Point p){
        return (Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y)));
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= "+first.distance());
        System.out.println("distance(second)= " +first.distance(second.x,second.y));
        System.out.println("distance(2,2)= "+first.distance(2,2));

        //instantiating object of constructor with no parameter and no initialization
        Point point = new Point();

        //calling distance method with no x, y co-ordinates. distance between 0,0 and 0,0
        System.out.println("distance()= "+ point.distance());

        System.out.println((second.distance(first)));
        System.out.println((first.distance(second)));

//        //the below 2 method calls have same result
//        System.out.println(point.distance(first));//distance between uninitialised constructor(x=0,y=0) and (6,5)
//        System.out.println(first.distance(0,0));//distance between (6,5) and second point (0,0)
    }

}
