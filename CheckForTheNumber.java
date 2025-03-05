import java.util.Scanner;

class CheckForTheNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[5];
		// loop for input of numbers
		for(int i=0;i<5;i++){
			System.out.print("Enter the number: ");
			numbers[i]=sc.nextInt();
			
		}
			checkIfPositiveOrNegative(numbers);
			checkOddAndEven(numbers);
			CheckFirstAndLastElement(numbers);
		}
		
	
	
	public static  void checkIfPositiveOrNegative(int []numbers){
		for(int i=0;i<numbers.length;i++){
		if(numbers[i]>0){
			System.out.println("Number "+numbers[i]+" is positive");
		}
		else if(numbers[i]==0){
			System.out.println("Number "+numbers[i]+" is zero");
		}
		else {
		System.out.println("Number "+numbers[i]+" is negative");
		}
	}
	}
	public static void checkOddAndEven(int [] numbers){
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>0){
				if(numbers[i]%2==0){
					System.out.println("Number "+numbers[i]+" is even");
				}
				else {
					System.out.println("Number "+numbers[i]+" is odd");
				}
			}
		}
	}
	public static void CheckFirstAndLastElement(int [] numbers){
		if(numbers[0]>numbers[numbers.length-1]){
			System.out.println("The first element is greater than last so answer is : "+ 1);
		}
		else if(numbers[0]== numbers[numbers.length-1]){
			System.out.println("The last element and first element is equal so answer is : "+ 0);
		}
		else {
			System.out.println("The last element is greater than first so answer is : "+ -1);
		}
	}
	
}