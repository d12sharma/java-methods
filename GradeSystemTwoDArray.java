import java.util.Random;
import java.util.Scanner;

public class GradeSystemTwoDArray {

    // generate random marks for PCM subjects
    public static double[][] generateMarks(int students) {
        Random random = new Random();
        double[][] marks = new double[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = 10 + random.nextInt(90); 
            marks[i][1] = 10 + random.nextInt(90); 
            marks[i][2] = 10 + random.nextInt(90); 
        }
        return marks;
    }

    // calculate total, average, and percentage
    public static double[][] calculateResults(double[][] marks) {
        int students = marks.length;
        double[][] results = new double[students][3];

        for (int i = 0; i < students; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();


        double[][] marks = generateMarks(students);
        double[][] results = calculateResults(marks);


        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f%%\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }
}