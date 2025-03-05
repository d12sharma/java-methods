import java.util.Scanner;

class Quadratic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		double a =sc.nextDouble();
		System.out.println("Enter b :");
		double b =sc.nextDouble();
		System.out.println("Enter c :");
		double c =sc.nextDouble();
		double [] result = findTheRoots(a,b,c);
		
		
		if (Double.isNaN(result[0])) {
            System.out.println("No real roots exist.");
        } else if (result.length == 1) {
            System.out.println("The root is: " + result[0]);
        } else {
            System.out.println("The roots are: " + result[0] + " and " + result[1]);
        }
    }
		
	
	public static double[] findTheRoots (double a , double b , double c){
		double delta = (b*b) + (4*a*c);
		if(delta>0){
			double root1 = (-b + Math.sqrt(delta))/(2 * a);
			double root2 = (-b - Math.sqrt(delta))/(2 * a);
			return new double[] {root1,root2};
		}
		else if(delta==0){
			double root3 = -b/(2*a);
			return new double[] {root3};
		}
		else{
		return new double[] {Double.NaN};
		}
	}
}