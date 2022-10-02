import java.util.InputMismatchException;
import java.util.Scanner;

interface StudentFee
{
   abstract void getFee() throws Invalidfee;

}
class Invalidfee extends Exception
{
   public Invalidfee(String str)
    {
        super(str);
    }
}
class Student implements StudentFee
{
    String name;
    int fee;
    Scanner scanner=new Scanner(System.in);
     public void readName()
    {
        System.out.println("Enter the student name");
        name= scanner.next();
    }
    public void getFee() throws Invalidfee,InputMismatchException
    {
        System.out.println("Enter the fee");
        fee=scanner.nextInt();
        if(fee<0)
        {
            throw new Invalidfee("Amount must be higher than zero");
            //System.out.println("Amount must be higher than zero ");
        }
    }
    void show()
    {
        System.out.println("Student Name  : "+name);
        System.out.println("Fee           : "+fee);
    }
}
public class StudentInterface
{
    public static void main(String[] args)
    {
        Student st=new Student();
        st.readName();
        try
        {
            st.getFee();
            st.show();
        }
         catch (Invalidfee ex1) {
             System.out.println("Exception Handled");
             System.out.println(ex1.toString());
         }
        catch (InputMismatchException ex2)
        {
            System.out.println("Exception Handeld");
            System.out.println("Fee must be a number");
            System.out.println(ex2.toString());
        }
        finally {
            System.out.println("Execuition Finished....");
        }

    }
}