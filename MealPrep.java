import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MealPrep {

	public static void main(String[] args) throws IOException  {
		String str1, str2, str3, str4, str5;
		System.out.println("Welcome to the Meal Prep Program. Let's see what you can make.");
		System.out.println("Do you have any meat?");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			str1 = br.readLine();
			if(str1.equals("yes")) {
				System.out.println("Do you have beef, chicken, or other meat?");
				str2 = br.readLine();
				if (str2.equals("beef")) {
					System.out.println("Do you have steak, ground, or roast?");
					str3 = br.readLine();
					if (str3.equals("ground")) {
						System.out.println("Do you have buns?");
						str4 = br.readLine();
						if (str4.equals("no")) {
							System.out.println("Do you have rice?");
							str5 = br.readLine();
							if (str5.equals("yes"))
								System.out.println("You should make casserole");
							else
								System.out.println("Invalid response.");
						}
						else
							System.out.println("Invalid response.");
					}
					else
						System.out.println("Invalid response.");
				}
				else if (str2.equals("chicken")) {
					System.out.println("Do you have whole or pieces?");
					str3 = br.readLine();
					if(str3.equals("pieces")) {
						System.out.println("Do you have vegetables?");
						str4 = br.readLine();
						if (str4.equals("no")) {
							System.out.println("Do you have pasta?");
							str5 = br.readLine();
							if (str5.equals("yes"))
								System.out.println("You should make chicken piccata");
							else
								System.out.println("Invalid response.");
						}
						else
							System.out.println("Invalid response.");
					}
					else if(str3.equals("whole")) {
						System.out.println("Do you have pasta?");
						str4 = br.readLine();
						if (str4.equals("no")) {
							System.out.println("Do you have rice?");
							str5 = br.readLine();
							if (str5.equals("yes"))
								System.out.println("You should make chicken rice");
							else
								System.out.println("Invalid response.");
						}
						else
							System.out.println("Invalid response.");
					}
					else
						System.out.println("Invalid response.");
				}
				else
					System.out.println("Invalid response.");		
			}
			else if (str1.equals("no")) {
				System.out.println("Do you have any vegetables?");
				str2 = br.readLine();
				if (str2.equals("yes")) {
					System.out.println("Do you have any eggplant?");
					str4 = br.readLine();
					if (str4.equals("yes")) {						
						System.out.println("Do you have any tomato?");
						str5 = br.readLine();
						if (str5.equals("yes"))
							System.out.println("You should make eggplant paramesan");
						else
							System.out.println("Invalid response.");
					}
					else
						System.out.println("Invalid response.");
				}	
				else
					System.out.println("Invalid response.");
			}
			else
				System.out.println("Invalid response.");
		}
	}
}