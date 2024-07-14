import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Student here.
 *
 * @author Urmila 
 * @version (a version number or a date)
 */
public class Student
{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // marks array declaration to store marks
        ArrayList<Integer> marksArray = new ArrayList<>();
        
        // Allow the user to enter the assignment name
        System.out.print("Please enter the assignment name: ");
        String nameOfAssignment = scanner.nextLine();
         // Allow the user to enter marks for 30 students 
        for (int i = 1; i <= 30; i++) {
            int studentMark;
            while (true) {
                System.out.print("Please enter mark for student " + i + ": ");
                studentMark = scanner.nextInt();
                //Validate student mark between 0 and 30
                if (studentMark >= 0 && studentMark <= 30) {
                   marksArray.add(studentMark);
                    break;
                } else {
                    System.out.println("Invalid mark. Please enter a mark between 0 and 30.");
                }
            }
        }

    }
}
