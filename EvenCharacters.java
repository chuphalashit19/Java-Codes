
public class EvenCharacters {
	public static int j=0;			//declaring j as global variable as its value keep increasing 
	public static void printEvenCharacters(String str) {
		while(j < str.length()) {			//j is compared with string length if its less, then its enters the loop
			if(j % 2 == 0) {				// this if statement is to check if the character is at even position
				char a = str.charAt(j);		// this help to fetch the character at a position from string 
				System.out.print(a);		// printing the character one by one 
				j += 1;						// incrementing the global variable as we are making use of recursion
				printEvenCharacters(str);	// calling the recursive method, by calling the function again with
			}
			else
				j += 1;						//incrementing the global variable even if the character is at odd position
		}
	}
	public static void main(String[] args) {
		String str = "murcielago";									// initializing the 'str' variable with a string
		System.out.println("\nOriginal String: " +str+ "\n");		// printing original string
		System.out.print("Even Charcters String: ");				// printing the statement for even characters string
		printEvenCharacters(str);									// calling the method for first time
	}
}
