import java.util.Scanner;
public class SafetyFeatures {

	public static void main(String[] args) {
		int carYear;
		try (Scanner input = new Scanner(System.in)) {
			carYear = input.nextInt();
		}
		if(carYear < 1968)
			System.out.println("Probably has few safety features.");
		if(carYear > 1971)
			System.out.println("Probably has seat belts.");
		if(carYear > 1990)
			System.out.println("Probably has anti-lock breaks.");
		if(carYear > 2000)
			System.out.println("Probably has airbags.");
	}

}
