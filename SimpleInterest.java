import java.util.Scanner;

class SimpleInterest {
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the principal : ");
			int principal = sc.nextInt();
			System.out.println("Enter the rate of interest : ");
			int rate = sc.nextInt();
			System.out.println("Enter the time : ");
			int time = sc.nextInt();
			
			CalculateSimpleInterest(principal,rate,time);
			
	}
	public static void CalculateSimpleInterest(int principal,int rate,int time) {
			System.out.println("Simple Interest is :"+(principal*rate*time)/100);
	}
}