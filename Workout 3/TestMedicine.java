import java.util.Random;

class Medicine
{
    void displayLabel()
    {
        System.out.println("\n     Cipla Pharma Limited \t Cipla House,Lowe Parel Mumbai.");
		System.out.println("-----------------------------------------------------------------");

    }
}
class Tablet extends Medicine{
    void displayLabel()
    {
        System.out.println("\nTablets must be stored in a cool dry place.");
    }
}
class Syrup extends Medicine
{
    void displayLabel()
    {
        System.out.println("\nProtect  syrup from light,Keep out of reach of children and Close the cap tightly after every use.");
    }
}
class Ointment extends Medicine
{
    void displayLabel()
    {
        System.out.println("\nOintment is for External use only and keep the tube tightly closed after use.");
    }
}


public class TestMedicine
{
    public static void main(String[] args)
    {   System.out.println("\n-------------------------------------------------------------------");
	    System.out.println("\n Base class Medicine object is created and display the label");
        Medicine med = new Medicine();
        med.displayLabel();
        Random rn=new Random();
        int ran= rn.nextInt(3)+1;
        System.out.println("\nRandomly generating the objects of child class \n");
        System.out.println("Random 1 : Displaying the tablet label");
        System.out.println("Random 2 : Displaying the syrup label");
        System.out.println("Random 3 : Displaying the ointment label\n");
        System.out.println("The randomly generated number is "+ran);
        if (ran==1)
        {
            Tablet tab=new Tablet();
            tab.displayLabel();
        }
        else if (ran==2)
        {
            Syrup sp=new Syrup();
            sp.displayLabel();
        }
        else if (ran==3)
        {
            Ointment omt=new Ointment();
            omt.displayLabel();
        }

    }
}