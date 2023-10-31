package resources;
//Java program to overload constructors

public class ConstructorOverLoading_25 {
    int id;
    String name;
    int age;

    //creating 2 argument constructor
    public ConstructorOverLoading_25(int i, String n) {
        id = i;
        name = n;
    }
    public ConstructorOverLoading_25(int i, String n, int a) {
        id = i;
        name = n;
        age=a;
    }

    public void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        ConstructorOverLoading_25 s1= new ConstructorOverLoading_25(111,"Karan");
        ConstructorOverLoading_25 s2= new ConstructorOverLoading_25(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
