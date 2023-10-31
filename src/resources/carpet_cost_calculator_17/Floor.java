package resources.carpet_cost_calculator_17;

public class Floor {

    //instance variables
    double width, length;

    //constructor with initialization
    public Floor(double w, double l) {
        if (w < 0) {
            this.width = 0;
        } else if (l < 0) {
            this.length = 0;
        } else {
            this.width = w;
            this.length = l;
        }
    }

    //Method to calculate area and return
public double getArea(){
        return(width*length);
}


}
