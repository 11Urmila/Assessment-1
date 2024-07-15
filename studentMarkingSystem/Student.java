import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Student here.
 * This Student class contain one main method which calculate the mean and standard deviation of students entered by the user
 * @author Urmila 
 * @version Updated 
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
        // Display Assignment name and marks
        System.out.println("Assignment: " + nameOfAssignment);
        System.out.println("Marks: " + marksArray);

        // Declare variables to store maximum and minimum mark
        int minimumMark =30;
        int maximumMark=0;
        //Using this for loop calculate the minimum and maximum mark
        for (int mark : marksArray) {
            if (mark < minimumMark) {
                minimumMark = mark;
            }
            if (mark > maximumMark) {
                maximumMark = mark;
            }
        }
        //Display minimum and maximum mark among 30 students
        System.out.println("Minimum mark: " + minimumMark);
        System.out.println("Maximum mark: " + maximumMark);
        // Calculate and print mean and standard deviation
        double sum = 0;
        for (int mark : marksArray) {
            sum += mark;
        }
        double mean = sum / marksArray.size();
        double sumOfSquares = 0;
        for (int mark : marksArray) {
             sumOfSquares += (mark - mean) * (mark - mean);
        }
        double variance = sumOfSquares / marksArray.size();
        double standardDeviation = calcSQRT(variance);
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
     // calculate the square root using the long division method
    public static double calcSQRT(double num) {
        double precision = 0.00001; // Precision level
        double guess = num;
        while ((guess - num / guess) > precision) {
            guess = (guess + num / guess) / 2;
        }
        return guess;
    }
}
