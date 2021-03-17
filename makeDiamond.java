import java.util.Scanner;
public class makeDiamond {
	
	public static void printDiamond (char letter) {
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
	            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
	            'W', 'X', 'Y', 'Z' };
	    int lnum = 0;
	    String[] diamond = new String[26];
	 
	    for (int i = 0; i < letters.length; i++) {
	    	if (letters[i] == letter) {
	    		lnum = i;
	            break;
	        }
	    }
	    // constructing diamond
	    for (int i = 0; i <= lnum; i++) {
	    	diamond[i] = "";
	        // adding initially spaces
	        for (int j = 0; j < lnum - i; j++) {
	        	diamond[i] += ".";
	        }
	        
	        // adding the letter
	        diamond[i] += letters[i];
	            
	        // add space between letters
	        if (letters[i] != 'A') {
	        	for (int j = 0; j < 2 * i - 1; j++) 
	        	{ 
	        		diamond[i] += ".";
	        	} 
	            // add letter
	            diamond[i] += letters[i];
	        } 
	        // Draw the first part of the diamond 
	        System.out.println(diamond[i]);
	    } 
	    for (int i = lnum - 1; i >= 0; i--)
	    {
	    	// Draw the second part of the diamond
	    	// Writing the diamondArray in reverse order
	        System.out.println(diamond[i]);
	    }
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a letter: ");
			String c = sc.next();
			c = c.toUpperCase();
			if (c.length() >= 2) {
				System.out.println("Invalid Input !");
				return;
			}
			else {
				char ch = c.charAt(0);
				printDiamond(ch);
			}
		}
	}
}
