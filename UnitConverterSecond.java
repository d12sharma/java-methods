import java.util.Scanner;
public class UnitConverterSecond {

    // Method to convert yard to feet
    public static double convertyard2feet(double yards) {
        double yards2feet = 3;
        return  yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
	// Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
	
	

    public static void main(String[] args) {
        // input for km , miles , meters , feet
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the yards :");
        double yards = sc.nextDouble();
		System.out.println("Enter the inches :");
        double inches = sc.nextDouble();
		System.out.println("Enter the meters :");
        double meters = sc.nextDouble();
		System.out.println("Enter the feet :");
        double feet = sc.nextDouble();

        System.out.println(yards + " yard to feet : "+convertyard2feet(yards));
        System.out.println(feet+ " feet to yards: " + convertFeetToYards(feet));
        System.out.println(meters + " meters to inches: " + convertMetersToInches(meters));
        System.out.println(inches + " inches to meters: " + convertInchesToMeters(inches));
		System.out.println(inches + " inches to centimeters: " + convertInchesToCentimeters(inches));
		
    }
}
