import java.util.*;
import java.util.Set;
import java.util.Iterator;
public class LinearProbingHashTable 
{	

	  static <E> void search(E data)
	  {
		  int count = 0, key = 0;
		  String value;
		  Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>(); 
		  hashtable.put(1, "Ash"); 
		  hashtable.put(2, "Rock"); 
		  hashtable.put(3, "John"); 
		  hashtable.put(4, "Daisy"); 
		  hashtable.put(5, "Karan");
          hashtable.put(6, "Rahul");
		  Set<Integer> keys = hashtable.keySet();
	        
	        //Obtaining iterator over set entries
		  Iterator<Integer> itr = keys.iterator();
		  while (itr.hasNext())
		  { 
	           // Getting Key
			  Integer str = itr.next();

			  value = hashtable.get(str);
			  if (value == data) 
			  {
				  count += 1;
				  key = str;
			  }
		  }
		  if(count >= 1)
		  {
			  System.out.println("Index of the "+data+ " is "+key);
		  }
		  else
			  System.out.println("Data does not exist in the hash table");
	  }

	public static void main(String[] args) 
	{
		    search("Daisy");
		    search("Rohit");
	}
}
