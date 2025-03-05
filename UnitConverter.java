import java.util.Scanner;
public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // input for km , miles , meters , feet
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the km :");
        double km = sc.nextDouble();
		System.out.println("Enter the miles :");
        double miles = sc.nextDouble();
		System.out.println("Enter the meters :");
        double meters = sc.nextDouble();
		System.out.println("Enter the feet :");
        double feet = sc.nextDouble();

        System.out.println(km + " km to miles: " + convertKmToMiles(km));
        System.out.println(miles + " miles to km: " + convertMilesToKm(miles));
        System.out.println(meters + " meters to feet: " + convertMetersToFeet(meters));
        System.out.println(feet + " feet to meters: " + convertFeetToMeters(feet));
    }
}
