public class pattern {
	public static void box4(int[][] arr) {
		//creating 4 box
	    for(int i=0; i<7; i++){
	        for(int j=0; j<7; j++){
	            if((i==0) && (j>=0 && j<7))
	                arr[i][j] = 4;
	            if(j==0 && (i>=0 && i<7))
	                arr[i][j] = 4;
	            if(j==6 && (i>=0 && i<7))
	                arr[i][j] = 4;
	            if(i==6 && (j>=0 && j<7))
	                arr[i][j] = 4;
	        }
	    }
	}
	
	public static void box2(int[][] arr) {
		//creating 2 box
	    for(int i=0; i<7; i++){
	        for(int j=0; j<7; j++){
	            if(i==2 && (j==2||j==3||j==4))
	                arr[i][j] = 2;
	            if(j==2 && (i==3||i==4))
	                arr[i][j] = 2;
	            if(j==4 && (i==3||i==4))
	                arr[i][j] = 2;
	            if(i==4 && (j==3||j==4))
	                arr[i][j] = 2;
	        }
	    }
	}
	
	public static void box3(int[][] arr) {
		//creating 3 box
	    for(int i=0; i<7; i++){
	        for(int j=0; j<7; j++){
	            if(i==1 && (j==1||j==2||j==3||j==4||j==5))
	                arr[i][j] = 3;
	            if(j==1 && (i==2||i==3||i==4||i==5))
	                arr[i][j] = 3;
	            if(j==5 && (i==2||i==3||i==4||i==5))
	                arr[i][j] = 3;
	            if(i==5 && (j==2||j==3||j==4))
	                arr[i][j] = 3;
	        }
	    }
	}
	
	public static void box1(int[][] arr) {
		//putting 1 in middle
	    arr[3][3] = 1;
	}
	
	public static void printArray(int[][] arr) {
		for(int i=0; i<7; i++){
	        for(int j=0; j<7; j++)
	            System.out.print(arr[i][j] + "");
	        System.out.print("\n");;
	    }
	}
	public static void main(String[] args) {
		int[][] arr = new int[7][7];
		box4(arr);
		box3(arr);
		box2(arr);
		box1(arr);
		printArray(arr);
	}
}
