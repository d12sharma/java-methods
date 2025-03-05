import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int members = 10;

        // 2D array to store weight, height (in cm), and BMI
        double[][] personData = new double[members][3];
        String[] bmiStatus = new String[members];

        // Take input for weight and height
        for (int i = 0; i < members; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) System.out.println("Please enter a positive value!");
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (cm): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) System.out.println("Please enter a positive value!");
            } while (personData[i][1] <= 0);
            
            // Calculate BMI
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);

            // Determine BMI Status
            bmiStatus[i] = determineBMIStatus(personData[i][2]);
        }

        // Display results
        System.out.println("\nBMI Report:");
        
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        
        for (int i = 0; i < members; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                (i + 1), personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }
        
        sc.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;  // Convert cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
}
