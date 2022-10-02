abstract class Car
{
    int NoofWheels;
    abstract void ignition();

    void ChangeGear()
    {
        System.out.println("Gear changed...");
    }
}
class Sedan extends Car {
    void ignition()
    {
        System.out.println("Sedan started...");
    }
    void wheels (int num)
    {
        this.NoofWheels=num;
        System.out.println("Sedan has "+NoofWheels+" wheels");
    }

}

public class Mainprgm
{
    public static void main(String[] args)
    {
        Sedan sed=new Sedan();
        sed.ignition();
        sed.ChangeGear();
        sed.wheels(4);
    }
}