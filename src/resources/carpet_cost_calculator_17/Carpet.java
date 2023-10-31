package resources.carpet_cost_calculator_17;

public class Carpet {
    //instance variable
    double cost;

    //constructor
    public Carpet(double c) {
        if (c < 0) {
            this.cost = 0;
        } else {
            this.cost = c;
        }
    }

    public double getCost(){
        return cost;
    }

}
