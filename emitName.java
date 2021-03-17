import java.io.*;
import java.util.*;

public class emitName {
	public static void emitName(String firstNameFileName, String lastNameFileName) throws FileNotFoundException
	{
		String firstName = "";
		String lastName = "";
	    Random rand = new Random();
	    int n = 0;
	    int c = 0;
		FileInputStream firstFile = new FileInputStream(firstNameFileName);       
		FileInputStream lastFile = new FileInputStream(lastNameFileName);
		Scanner sc1 = new Scanner(firstFile);
		Scanner sc2 = new Scanner(lastFile);
		while(sc1.hasNext())
	    {
			++n;
	        String line = sc1.nextLine();
	        if(rand.nextInt(n) == 0) {
	           firstName = line;
	        }
	    }
		sc1.close();
		while(sc2.hasNext())
	    {
			++c;
	        String line = sc2.nextLine();
	        if(rand.nextInt(n) == 0) {
	           lastName = line;
	        }
	    }
		sc2.close();
		System.out.println("Name: "+ firstName + " " +lastName);
	}

	public static void main(String[] args) throws FileNotFoundException {
		String firstNameFileName = "First Names.txt";
		String lastNameFileName = "Last Names.txt";
		emitName(firstNameFileName, lastNameFileName);
	}
}