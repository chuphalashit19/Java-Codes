import java.util.*; 
public class RemoveAllOccurrences{
	public static List<Integer> lis;
	public static <T> int removeCount(T element) {
		int n = 0;
		for(int i=0; i<lis.size(); i++) {
			if(lis.get(i)== element) {
				lis.remove(i);
				n ++;
			}
		}
		return n;
		
	}
    public static void main(String args[]) 
    { 
    	lis = Arrays.asList(3 , 4, 5, 3 , 5, 2, 3 , 4, 5, 2, 3);
    	System.out.println("Occurences of element in unsorted list: " + removeCount(3));
    } 
} 
