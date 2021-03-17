import java.util.*;  
class BMI   
{  

	private static float wk;
	private static float hm;

	public static void main(String[] args)  
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your weight in pounds: ");  
			int w = sc.nextInt();  
			System.out.print("Enter your height in inches: ");  
			int h= sc.nextInt();
			wk = (float) (0.45359 * w);
			hm = (float) (0.0254 * h);
			float bmi = wk/(hm*hm);
			System.out.printf("BMI calculated is : %.2f", bmi);
		}  
	}  
}  