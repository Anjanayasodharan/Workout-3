import java.util.*;
class Faculty{
    int facultyid;
    float salary;
}
class FulltimeFaculty extends Faculty{
  float basic;
  float allowence;
  
  FulltimeFaculty(float basic,float allowence){
      this.basic=basic;
      this.allowence=allowence;
  }
   
    float salaryF(){
        float salary1;
        salary1=(basic+allowence);
        return salary1;
    }
    
    void dispaly1(){
        System.out.println(""+salaryF());
    }
}
class ParttimeFaculty extends Faculty{
   int hour;
   float rate;
   ParttimeFaculty(int hour,float rate){
       this.hour=hour;
       this.rate=rate;
   }
    
    float salaryP(){
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }
    void display2(){
        System.out.println(""+salaryP());
    }
}

class XYY{
    
    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Basic salary and Allowance");
        float b= scanner.nextFloat();
        float h= scanner.nextFloat();
        System.out.println("Enter the hour and rate per hour");
        int hr= scanner.nextInt();
        float rt= scanner.nextFloat();
        FulltimeFaculty S1 = new FulltimeFaculty(b,h);
        ParttimeFaculty S2 = new ParttimeFaculty(hr,rt);
       S1.dispaly1();
       S2.display2();
      
    }
}