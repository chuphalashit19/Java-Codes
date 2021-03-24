import java.util.Scanner;
public class SortDescending {
	static Scanner sc = new Scanner(System.in);
	public static void readArray(double[] arr){
		int i;
		System.out.println("Enter the elements");
		for(i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextDouble();
		}
	}
	public static void sortArray(double[] arr) {
		double t = 0;
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {
                   t = arr[i];
                   arr[i] = arr[j];
                   arr[j] = t;
               }
            }  
        }
	}
	public static void displayArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        } 
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter size to create array:: ");
		n = sc.nextInt();
		double[] arr = new double[n];
		readArray(arr);
		System.out.println("Before sorting elememts are");
		displayArray(arr);
		sortArray(arr);
		System.out.println("\nAfter sorting elememts are in descending order");
		displayArray(arr);
	}

}
