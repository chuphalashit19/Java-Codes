import java.io.*; 
import java.util.*;
class Occurences {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the integers between 1 and 100:");
		String[] integersInString = br.readLine().split(" ");
		int a[] = new int[integersInString.length];
		for (int i = 0; i < integersInString.length; i++) {
			int num = Integer.parseInt(integersInString[i]);
			if (num != 0)
				a[i] = num;
		}
		HashMap<Integer, Integer> CountOccurrences = new HashMap<Integer, Integer>();
		
		for (int num : a) {
            if (CountOccurrences.containsKey(num)) {
                // If number is present in CountOccurrences, 
                // incrementing its count by 1 
            	CountOccurrences.put(num, CountOccurrences.get(num) + 1);
            } 
            else {
            	if(num != 0)
                	// If number is not present in CountOccurrences, 
                	// putting the number to CountOccurrences with 1 as it's value 
            		CountOccurrences.put(num, 1); 
            }
        }
		// Printing the CountOccurrences 
        for (@SuppressWarnings("rawtypes") Map.Entry entry : CountOccurrences.entrySet()) {
        	int num = (int) entry.getValue();
        	if(num > 1)
            	System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        	else
        		System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time");
        }
	}
}
