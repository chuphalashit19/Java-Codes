import java.util.Scanner;
public class Sum
{
	public static void main(String[] args) {
		int sum = 0;       //initializing sum
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a positive integer: ");
			int n = sc.nextInt();		//taking input from user
			if(n < 0)					// if input is negative then invalid input will be printed
			    System.out.println("Invalid Input!");
			else {	
				for(int i=1; i<=n; i++){		
					sum += i*n;						//calculating sum of series 
				}
				System.out.println("The sum of the series is " + sum);		//printing sum of series
			}
		}
	}
}