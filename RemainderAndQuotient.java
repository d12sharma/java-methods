import java.util.Scanner;

class RemainAndQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisior number: ");
        int divisior = sc.nextInt();

       

       int result[]= findRemainderAndQuotient(number,divisior);
	   System.out.println("The remainder is "+result[0]);
	   System.out.println("The quotient is "+result[1]);
        

        
    }

    public static int[] findRemainderAndQuotient(int number, int divisor)  {
        int Remainder = number%divisor;
		int quotient = number/divisor;
		return new int[] {Remainder,quotient};
		
      
    }
}
