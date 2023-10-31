package resources.method_overriding_24;

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI rate of interest: " + s.getRateOfInterest());
        System.out.println("ICICI rate of interest: " + i.getRateOfInterest());
        System.out.println("AXIS rate of interest: " + a.getRateOfInterest());

    }
}
