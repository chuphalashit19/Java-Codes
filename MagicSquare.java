import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MagicSquare {
	public static int[][] initializeArray(int[][] a) {
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				a[row][col] = 0;
			}
		}
		return a;
	}
	
	public static void generateMagicSquare(int [][]a, int size){
		int num = 1;
	    int row = 0;
	    int col = size / 2;
	    int c_row;
	    int c_col;
	    while (num <= size * size) {
	        a[row][col] = num;
	        num++;
	        c_row = row;
	        c_col = col;
	        row -= 1;
	        col += 1;
	        if (row == -1) {
	            row = size - 1;
	        }
	        if (col == size) {
	            col = 0;
	        }
	        if (a[row][col] != 0) {
	            row = c_row + 1;
	            col = c_col;
	            if (row == -1) {
	                row = size - 1;
	            }
	        }
	    }
	}
	public static void main(String[] args) throws Exception{
		BufferedReader kbd = new BufferedReader(new
		InputStreamReader(System.in));
		int size = 0;
		System.out.println("Magic Square Generator");
		System.out.print("Enter the desired size of the magic square: ");
		size = Integer.parseInt(kbd.readLine());
		int[][] a = new int[size][size];
		if (size % 2 == 0) // size is an even number
			System.out.println("The size must be an odd number.");
		else if (size < 3)
			System.out.println("The magic square may be too big or too small");
		else {
			System.out.println(size + " by " + size + " magic square: \n");
			generateMagicSquare(a, size);
			display(a);
		}
	}
	/**
	* Displays each element of a two dimensional on a space with
	* uniform width.
	* Given: Two-dimensional array
	* For row =0 to last valid row of the given two-dimensional array
	* For column = 0 to last valid column of a row
	* Print the element at the current row and column on a fixed width space
	* Print the enter character
	*/
	public static void display(int[][] array) {
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				System.out.printf("%6d", array[r][c]);
			}
			System.out.println();
		}
	}
}