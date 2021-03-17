public class charOccurences {
	static int occ (String [] arr, char ch) {
		int count = 0;
		for(int i=0; i<arr.length; i++)
			if(arr[i].charAt(0) == ch)
				count += 1;
		return count;
	}
	public static void main(String[] args) {
		String[] arr = {"h", "e", "l", "l", "o", "w", "o", "r", "l", "d"};
		char ch = 'l';
		System.out.println("Occurences of '" +ch+ "' in the string are: " + occ(arr, ch));
	}

}
