import java.util.Scanner;
public class MatrixMulti {
	static Scanner sc = new Scanner(System.in);
	public static void readMatrix(int[][] matrix){
		int i, j;
		for(i=0; i<matrix.length; i++)
			for(j=0; j<matrix[i].length; j++)
				matrix[i][j] = sc.nextInt();
	}
	public static void multiMatrix(int[][] matrix1, int[][] matrix2, int[][] matrix3) {
		for(int i=0;i<matrix1.length;i++){    
			for(int j=0;j<matrix1[i].length;j++){    
				matrix3[i][j]=0;
				for(int k=0;k<matrix1[i].length;k++)      
				{      
					matrix3[i][j] += matrix1[i][k] * matrix2[k][j];      
				}  
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
		int row1, col1, row2, col2;
		System.out.print("Enter the row size for 1rst matrix:: ");
		row1 = sc.nextInt();
		System.out.print("Enter the column size for 1rst matrix:: ");
		col1 = sc.nextInt();
		System.out.print("Enter the row size for 2nd matrix:: ");
		row2 = sc.nextInt();
		System.out.print("Enter the column size for 2nd matrix:: ");
		col2 = sc.nextInt();
		System.out.println();
		while(row1 != row2 || col1 != col2) {
			System.out.print("Enter the row size for 1rst matrix:: ");
			row1 = sc.nextInt();
			System.out.print("Enter the column size for 1rst matrix:: ");
			col1 = sc.nextInt();
			System.out.print("Enter the row size for 2nd matrix:: ");
			row2 = sc.nextInt();
			System.out.print("Enter the column size for 2nd matrix:: ");
			col2 = sc.nextInt();
		}
		int[][] matrix1 = new int[row1][col1];
		int[][] matrix2 = new int[row2][col2];
		int[][] matrix3 = new int[row1][col1];
		System.out.println("Read the elements for 1rst Matrix");
		readMatrix(matrix1);
		System.out.println("Read the elements for 2nd Matrix");
		readMatrix(matrix2);
		System.out.println("Elements in 1rst matrix");
		displayMatrix(matrix1);
		System.out.println("Elements in 2nd matrix");
		displayMatrix(matrix2);
		multiMatrix(matrix1, matrix2, matrix3);
		System.out.println("After multiplication elememts in 3rd matrix");
		displayMatrix(matrix3);
	}

}
