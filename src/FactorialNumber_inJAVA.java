import java.util.Scanner;

public class FactorialNumber_inJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number to calculate factorial number/n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}
	
	
	
	public static long factorial(int n)
	{
		
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
			
		
	}

}
