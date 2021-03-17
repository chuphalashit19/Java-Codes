public class ArrayList
{
    public static void mystery (int [] array)
    {
        int tmp = array[array.length - 1];		// storing last element from list in tmp varaible
        for(int i = 1; i < array.length; i++){
            array[i] = array[i-1];				// storing first element from the list
        }										// into all indexes after first position
        array[0] = tmp;							// then finally storing tmp variable
        											// into 1rst array position
        for(int i=0; i<array.length; i++)
            System.out.println(array[i]);			// printing the array
    }
	public static void main(String[] args) {
		int[] list = {10, 20, 30, 40, 50};			//initializing the array with elements
		mystery(list);								//calling the mystery method
	}	
}