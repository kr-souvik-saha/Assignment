import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int nextNum=0;
		
		System.out.println("Enter first number : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int num2=sc.nextInt();
		
		System.out.println("The seris is :");
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		
		for(int i=1;i<13;i++) {
			nextNum=num1+num2;
			num1=num2;
			num2=nextNum;
			
			System.out.print(nextNum+" ");
		}

	}

}
