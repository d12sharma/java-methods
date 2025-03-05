import java.util.Scanner;

public class FriendsComparisonUsingMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Amar's height: ");
        double heightAmar = input.nextDouble();
        
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        double heightAkbar = input.nextDouble();
        
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        double heightAnthony = input.nextDouble();
		
		
        System.out.println("The youngest friend is: " + youngestFriend(ageAkbar,ageAmar,ageAnthony));
        System.out.println("The tallest friend is: " + tallestFriend(heightAkbar,heightAmar,heightAnthony));
        
       
    }
        
        public static String youngestFriend(int ageAkbar,int ageAmar,int ageAnthony){
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            return "Amar";
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            return "Akbar";
        } else {
            return "Anthony";
        }

		}	
        
        public static String tallestFriend(double heightAkbar,double heightAmar,double heightAnthony){
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            return "Amar";
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            return "Akbar";
        } else {
            return "Anthony";
        }
		}
        
}