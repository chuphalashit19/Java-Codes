import java.util.*;
import java.util.Map.Entry;
public class ElectionsWinner
{
	public static Scanner sc = new Scanner(System.in);
	public static void printingWinner(String TotalVotes[])
    {
		// creating a hash map to store the votes count for each name
        Map<String, Integer> votingMap = new HashMap<String, Integer>();
        for (String str : TotalVotes)
        {
            if (votingMap.keySet().contains(str))
            	votingMap.put(str, votingMap.get(str) + 1);
            else
            	votingMap.put(str, 1);
        }
        
        int m = 0;
        
        // finding the maximum votes for the names and storing the value in variable 'm'
        for (Entry<String, Integer> value : votingMap.entrySet())
        {
            Integer val = value.getValue();
            if (val > m)
            {
                m = val;
            }
        }
        
        // this part is to find how many have the maximum votes
        // so the count of names is stored in variable 'total'
        int total = 0;
        for (Entry<String, Integer> value : votingMap.entrySet())
        {
        	Integer val = value.getValue();
            if (val == m)
            {
                total++;
            }
        }
        
        //finally storing the names to an array whose votes are maximum
        String[] names = new String[total];
        int j = 0;
        
        for (Entry<String, Integer> value : votingMap.entrySet())
        {
        	String key = value.getKey();
            Integer val = value.getValue();
            if (val == m)
            {
                m = val;
                names[j] = key;
                j++;
            }
        }
        
        //sorting the array in lexicographical order
        for (int i = 0; i < names.length; i++) {
            for (int k = i + 1; k < names.length; k++) {
                if (names[i].compareToIgnoreCase(names[k])> 0) {
                    String temp = names[i];
                    names[i] = names[k];
                    names[k] = temp;
                }
            }
        }
        
        //printing the elements in array
        for(int i=0; i<names.length; i++)
        {
        	System.out.println(names[i]);
        }
        
    }
    
    public static void main(String[] args)
    {
    	int n;
    	System.out.println("Enter the size: ");
    	n  = sc.nextInt();
    	String[] TotalVotes = new String[n];
    	for(int i=0; i<n; i++)
    	{
    		String name = sc.next();
    		TotalVotes[i] = name;
    	}
    	System.out.println("\nOutput:");
    	printingWinner(TotalVotes);
    }
}