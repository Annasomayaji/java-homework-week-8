package resources;

public class SimpleCalculator_18 {
    //Instance variables
    double firstNumber, secondNumber;

    //instance methods to get numbers
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    //instance methods to set numbers
    public void setFirstNumber(double num1) {
        firstNumber = num1;
    }

    public void setSecondNumber(double num2) {
        secondNumber = num2;
    }

    //method to add two numbers
    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return (firstNumber / secondNumber);
        }
    }

    public static void main(String[] args) {

        //create object of the class
        SimpleCalculator_18 calculator =new SimpleCalculator_18();

        //set values to first and second number
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        //call  addition and division methods via objects
        System.out.println("Add= "+ calculator.getAdditionResult());
        System.out.println("Subtract= "+ calculator.getSubtractionResult());

        //set new values
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        //call multiplication and division method
        System.out.println("Multiplication= "+calculator.getMultiplicationResult());
        System.out.println("Division= "+calculator.getDivisionResult());
    }
}
