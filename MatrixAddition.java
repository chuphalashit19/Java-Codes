import java.util.Scanner;
public class MatrixAddition {
	static Scanner sc = new Scanner(System.in);
	public static void readMatrix(int[][] matrix){
		int i, j;
		for(i=0; i<matrix.length; i++)
			for(j=0; j<matrix[i].length; j++)	
				matrix[i][j] = sc.nextInt();
	}
	public static void addMatrix(int[][] matrix1, int[][] matrix2, int[][] matrix3) {
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[i].length;j++){    
				matrix3[i][j]= matrix1[i][j] + matrix2[i][j]; 
			}
		}
	}
	public static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + "   ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int row, col;
		System.out.print("Enter the row size:: ");
		row = sc.nextInt();
		System.out.print("Enter the column size:: ");
		col = sc.nextInt();
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		int[][] matrix3 = new int[row][col];
		System.out.println("Read the elements for 1rst Matrix");
		readMatrix(matrix1);
		System.out.println("Read the elements for 2nd Matrix");
		readMatrix(matrix2);
		System.out.println("Elements in 1rst matrix");
		displayMatrix(matrix1);
		System.out.println("Elements in 2nd matrix");
		displayMatrix(matrix2);
		addMatrix(matrix1, matrix2, matrix3);
		System.out.println("After adding elememts in 3rd matrix");
		displayMatrix(matrix3);
	}

}
