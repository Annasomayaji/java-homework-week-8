package resources.pool_area_20;

public class Cuboid extends Rectangle {

    //declare instance variable
    double height;

    public Cuboid(double width, double length, double height) {
        //call parent constructor to initialize length and width
        super(length, width);

        this.height = height;
    }

    //instance method to return height
    public double getHeight() {
        return height;
    }

    //instance method to calculate and return volume
    public double getVolume() {
        return getArea() * height;
    }
}
