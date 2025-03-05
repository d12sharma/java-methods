import java.util.Scanner;

class SumOfNaturalNumbers{
	public static void main(String [] args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a natural number: ");
	 int number = sc.nextInt();
	 sumOfNaturalNumber(number);
	 
	 
	}
	public static void sumOfNaturalNumber(int number){
		int sum=0;
		for(int i=1;i<=number;i++){
			  sum= sum + i;
		}
		System.out.println("Sum is :"+sum);
	}
}	