package p1;

public class Student {
    String name;
    int id;
    int semseter;

    public Student (){

    }
    public Student(String name,int id,int semseter){
        this.name = name;
        this.id = id;
        this.semseter = semseter;
    }
    public void display()
    {
        System.out.println("Package1");
        System.out.println("Student Name :" +name);
        System.out.println("Student ID :" +id);
        System.out.println("Semester :" +semseter);
        System.out.println("-----------------------------------------");
    }
}
