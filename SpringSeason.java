import java.util.Scanner;

class SpringSeason{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month(1-12) :");
		int month = sc.nextInt();
		System.out.println("Enter the day (1-31) :");
		int day = sc.nextInt();
		methodForSpringSeason(month,day);
		
		
	}
	// method for checking spring season
	public static void methodForSpringSeason(int month , int day){
		if(month>=3 && month<=6){
			if(month==3){
				if(day>=20){
				System.out.println("It's a Spring season");
				}
				else{
				System.out.println("It's not a Spring season");
				
				}
			}
				else if (month==6){
					if(day<=20){
					System.out.println("It's a Spring season");
					}
					else{
					System.out.println("It's not a Spring season");
					}
				}
					else{
					System.out.println("It's a Spring season");
					}
				
			
			
		}
		else{
			System.out.println("It's not a Spring season");
			}
	}
}