package resources.carpet_cost_calculator_17;

public class Main {
    public static void main(String[] args) {
        //create objects of class Carpet and Floor
        //initialize values
        Carpet carpet=new Carpet(3.5);
        Floor floor =new Floor(2.75,4.0);

        //create object of class Calculator and instantiate with floor and carpet objects
        Calculator calculator=new Calculator(floor, carpet);

        //call method from Calculator class to get total cost which in-turn gets
        //length, width from Floor class
        //cost from Carpet class
        System.out.println("Total= "+ calculator.getTotalCost());
        carpet=new Carpet(1.5);
        floor=new Floor(5.4,4.5);
        calculator= new Calculator(floor,carpet);
        System.out.println("Total= "+calculator.getTotalCost());

    }
}
