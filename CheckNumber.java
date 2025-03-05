import java.util.Scanner;

class CheckNumber {
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number :");
			int number= sc.nextInt();
			methodForNumber(number); // calling method in main
			
			
			
			
	}
	//calculating method for checking number is positive ,negative or zero
	public static void methodForNumber(int number){
	if(number>0){
		System.out.println("The number "+number+" is positive");
	}
	else if (number==0){
		System.out.println("The number "+number+" is zero");
	}
	else{
		System.out.println("The number "+number+" is negative");
	}
	}
	
}