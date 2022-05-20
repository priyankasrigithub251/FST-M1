package Activities;

public class Car {
    String color="Silver",transmission="Automatic";
    int make,tyres,doors;
    Car(int tyres,int doors,int make)
    {
        this.tyres=tyres;
        this.doors=doors;
        this.make=make;
    }
    void displayCharacteristics()
    {

        System.out.println("Tyres count is "+tyres);
        System.out.println("Doors count is "+doors);
        System.out.println("Transmission is "+transmission);
        System.out.println("Make is "+make);
    }
    void accelerate()
    {
        System.out.println("Car is moving forward");
    }
    void brake()
    {
        System.out.println("Car has stopped");
    }
}
