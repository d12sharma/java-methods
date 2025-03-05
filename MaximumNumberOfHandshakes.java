import java.util.Scanner;

class MaximumNumberOfHandshakes {
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number of Students: ");
			int number = sc.nextInt();
			MethodForHandshakes(number); // calling method in main
			
			
			
			
	}
	//calculating method for number of hand shakes
	public static void MethodForHandshakes(int number){
		System.out.println("Enter the number of handshakes: "+ (number * (number - 1)) / 2);
	}
	
}