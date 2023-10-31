package resources.cylinder_19;

public class Circle {
    //declare instance variable
    double radius;

    //declare constructor and initialise radius
    public Circle(double r) {
        if (r < 0) {
            this.radius = 0;
        } else {
            this.radius = r;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }

}
