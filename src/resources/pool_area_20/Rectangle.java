package resources.pool_area_20;

public class Rectangle {
    //declare instance variables
    double length, width;

    //declare constructor and initialise
    public Rectangle(double w, double l) {
        if (l < 0) {
            this.length = 0;
        } else {
            this.length = l;
        }
        if (w < 0) {
            this.width = 0;
        } else {
            this.width = w;
        }
    }

    //get methods to return width, length and area
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return (length * width);
    }
}
