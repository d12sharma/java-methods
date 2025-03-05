import java.util.Scanner;

class NumberOfRounds {
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the side :"+1);
			double side1= sc.nextDouble();
			System.out.println("Enter the side :"+2);
			double side2= sc.nextDouble();
			System.out.println("Enter the side :"+3);
			double side3= sc.nextDouble();
			methodForRounds(side1,side2,side3); // calling method in main
			
			
			
			
	}
	//calculating method for number of rounds
	public static void methodForRounds(double side1,double side2,double side3){
		double perimeter = (side1+side2+side3);
		double Distance = 5000; // converted km to m 
		System.out.println("The number of rounds are: "+Distance/perimeter);
	}
	
}