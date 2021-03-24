public class copyOfArray {
	
	public static int[] myCopyOf(int[] origArr, int len)
	{
		int[] copyOfArr = new int[len];
		
		for (int i = 0; i < len; i++)
            copyOfArr[i] = origArr[i];
		
		copyOfArr[0]++;		// to make the copy of array
							// different from original array
		return copyOfArr;
	}
	
	public static void main(String[] args) {
		int origArr[] = {1, 8, 3, 6, 9, 2, 5};
		int newArr[];
		int len;
		
		System.out.println("Elements of Original Array: ");
        for (int i = 0; i < origArr.length; i++)
            System.out.print(origArr[i] + " ");
        
        len = origArr.length;
        newArr = myCopyOf(origArr, len);
        
        System.out.println("\n\nElements of Copy of Original Array ");
        for (int i = 0; i < newArr.length; i++)
            System.out.print(newArr[i] + " ");
	}
}
