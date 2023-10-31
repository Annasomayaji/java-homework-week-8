package resources.carpet_cost_calculator_17;

public class Calculator {
    //instance variables of user-defined class types!
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return ((this.floor.length * this.floor.width) * this.carpet.cost);

    }
}
