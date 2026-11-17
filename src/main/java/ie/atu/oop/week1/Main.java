package ie.atu.oop.week1;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("S101","Amy"));
        students.add(new Student("S102","Ben"));
        students.add(new Student("S103","Cara"));

        for(Student student : students)
        {
            System.out.println(student);
        }

        for(int i = 1; i <=2; i++) {
            System.out.println("Please enter a student Id: "); // Enter one valid ID and one invalid ID.
            String searchId = input.nextLine();
            boolean found = false;
            for (Student student : students) {
                if (student.getId().equals(searchId)) {
                    System.out.println("Found: " + student);
                    found = true;
                    break;
                }
            }
            if (!found)System.out.println("Student not found");
        }
    }
}