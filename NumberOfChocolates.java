import java.util.Scanner;

class NumberOfChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter childrens: ");
        int children = sc.nextInt();

       

       int result[]= findRemainderAndQuotient(chocolates,children);
	   System.out.println("The chcholate distributed to every children is "+result[0]);
	   System.out.println("The remaining chocolates are "+result[1]);
        

        
    }

    public static int[] findRemainderAndQuotient(int chocolates, int children)  {
        int chocolatesDistributed = chocolates/children;
		int remainingChocolates = chocolates%children;
		return new int[] {chocolatesDistributed,remainingChocolates};
		
      
    }
}
