import java.util.Scanner;

class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year :");
		int currentYear =sc.nextInt();
		leapYearOrNot(currentYear);
		
	}
	public static void leapYearOrNot(int currentYear){
		if(currentYear>=1582){
			if(currentYear%400==0){
				System.out.println("The Year "+currentYear+"is a leap year");
			}
			else if(currentYear%4==0){
				System.out.println("The Year "+currentYear+"is a leap year");
			}
		}
		else{
		System.out.println("The Year "+currentYear+" is  not a leap year");
		}
		
	}
}