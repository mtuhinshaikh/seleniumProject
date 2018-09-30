package java_basic;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class ConstructorDemo {

    String name;
    int id;

    public ConstructorDemo()

    {
        name = "Tuhin";
        id = 100;
    }

    public ConstructorDemo(String name, int rollNumber)

    {

        this.name = name;
        id = rollNumber;
    }

    public void printData() {
        System.out.println("The data is: " + name + " " + "id " + id);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        obj.printData();

        ConstructorDemo obj1 = new ConstructorDemo("Tuin", 200);
        obj1.printData();


    }


}
