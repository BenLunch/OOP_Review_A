package ie.atu.oop.week1;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("S101","Amy"));
        students.add(new Student("S102","Ben"));
        students.add(new Student("S103","Cara"));

        for(Student student : students)
        {
            System.out.println(student);
        }

        String searchId = "S101";
        boolean found = false;
        for(Student student : students)
        {
            if(student.getId().equals(searchId))
            {
                System.out.println("Found: " + student);
                found = true;
                break;
            }
        }
        if(!found) {System.out.println("Student not found");}
    }
}