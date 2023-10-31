package resources.encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        //setting values for variables
        obj.setName("Annapoorna");
        obj.setAge(18);
        obj.setRollNo(51);

        //displaying values of the variables

        System.out.println("My name: " + obj.getName());
        System.out.println("My age: " + obj.getAge());
        System.out.println("My roll Number: " + obj.getRollNo());

        //direct access of the variables is not possible due to encapsulation
    }
}
