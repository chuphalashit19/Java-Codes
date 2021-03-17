import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.util.Scanner;

public class NumberFile {    
	private static int []arr = new int[5000];
    public void writeToFile(String filepath, int lowerBound, int upperBound) throws Exception {
    	try (Scanner sc = new Scanner(System.in)) {
			File tempFile = new File(filepath);
			boolean exists = tempFile.exists();
			
			if (exists == true) {
				System.out.println("Do you want to overwrite the file (Y/N): ");
				char c = sc.next().charAt(0);
				if (c == 'Y') {
					// constructing the writer        
			    	BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
			    	
			        // writing the numbers in the range
			    	for(int number = lowerBound; number <= upperBound; ++number) {
			            writer.write(Integer.toString(number) + '\n');
			        }
			    	
			        // closing the writer
			        writer.close();
				}
				else {
					FileWriter fr = new FileWriter(filepath, true);
					BufferedWriter br = new BufferedWriter(fr);
			    	for(int number = lowerBound; number <= upperBound; ++number) {
			    		br.write(Integer.toString(number) + '\n');
			        }
			    	System.out.println("Data successfully appended");
			    	
			    	br.close();
			    	fr.close();
			   }
			}
			else {
				// constructing the writer        
				BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
				
			    // writing the numbers in the range
				for(int number = lowerBound; number <= upperBound; ++number) {
			        writer.write(Integer.toString(number) + '\n');
			    }
				
			    // closing the writer
			    writer.close();
			}
		}
    }
    
    public static void writeArrayToFile(String filepath) throws Exception
    {
    	// constructing the writer        
    	BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
    	
    	int size = 0;
        for(int i=0; i<arr.length; i++)
        	if(arr[i] != 0)
        		size++;
        
        // writing the numbers in the array
    	for(int i = 0; i<size; i++) {
    		if(arr[i] != 0)
    			writer.write(Integer.toString(arr[i]) + '\n');
        }
    	
        // closing the writer
        writer.close();
    }
    
    public void readData(String filepath) throws Exception {
        // constructing the reader
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        // Reading and storing numbers to the array
        String line;
        int i=0;
        while((line = reader.readLine()) != null && i < 5000) {
        		arr[i] = Integer.parseInt(line);
        		i++;
        }
        // Closing the reader
        reader.close();
    }
    
    public static void findNumberinArray(int num) {
    	int size = 0;
    	int loc = 0, tot=0;
        for(int i=0; i<arr.length; i++)
        	if(arr[i] != 0)
        		size++;
        // reading and summing each number from the array
        for (int i=0; i<size; i++) {
        	tot ++;
        	if(arr[i] == num)
        		loc = i+1;
        }
        if(tot == size)
        	System.out.println("Location of " +num+ " is " +loc);
        else
        	System.out.println("Number not found");
    }
    
    public int calcSum() {
        int sum = 0; // initializing sum to zero
        int size = 0;
        for(int i=0; i<arr.length; i++)
        	if(arr[i] != 0)
        		size++;
        // reading and summing each number from the array
        for (int i=0; i<size; i++)
            sum += arr[i];
        // Return the sum
        return sum;
    }

    public double calcAverage() {
        // Call calcSum to calculate the sum of the elements in the array
        int sum = calcSum();
        // Find the length of the array
        int size=0;
        for(int i=0; i<arr.length; i++)
        	if(arr[i] != 0)
        		size++;
        // Calculate the average
        double average = sum / size;
        // Return the average
        return average;
    }
    
    public static void arrayAcendingOrder() {
    	int size = 0, temp;
    	for(int i=0; i<arr.length; i++)
        	if(arr[i] != 0)
        		size++;
        // reading and summing each number from the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }
        }
        int j = 0;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] != 0) {
        		arr[j] = arr[i];
        		j++;
        	}        	
        }
        System.out.println("Array in ascending order: "+size);    
        for (int i = 0; i < size; i++)
        		System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void displayArray() {
        // Display the contents of the array
    	int size=0;
        for(int i=0; i<arr.length; i++)
        	if(arr[i] != 0)
        		size++;
        System.out.println("Array contents:");
        for (int i=0; i<size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // constructing the NumberFile object
        NumberFile numberFile = new NumberFile();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // usage loop
        boolean isRunning = true;
        while(isRunning) {
            try {
                // Display menu to the user
                System.out.println("Options:");
                System.out.println("1. Write new number range to file");
                System.out.println("2. Read numbers from file into the array");
                System.out.println("3. Write array's numbers to file");
                System.out.println("4. Print the numbers in the array");
                System.out.println("5. Sum the numbers in the array");
                System.out.println("6. Average the numbers in the array");
                System.out.println("7. Find the number in the array");
                System.out.println("8. Sort the numbers in the array in ascending order");
                System.out.println("9. Exit the program");
                System.out.println("Enter your choice:");
                // parsing choice
                int choice = Integer.parseInt(reader.readLine());
                // variables used in switch case
                String filepath;
                int lowerBound;
                int upperBound;
                switch(choice) {
                    case 1:
                        // writing the numbers in the range
                        System.out.println("Enter filepath:");
                        filepath = reader.readLine();
                        System.out.println("Enter lower bound:");
                        lowerBound = Integer.parseInt(reader.readLine());
                        System.out.println("Enter upper bound:");
                        upperBound = Integer.parseInt(reader.readLine());
                        numberFile.writeToFile(filepath, lowerBound, upperBound);
                        break;

                    case 2:
                        // reading data from the file and writing to the array
                        System.out.println("Enter filepath:");
                        filepath = reader.readLine();
                        numberFile.readData(filepath);
                        break;
                    
                    case 3:
                    	System.out.println("Enter filepath:");
                        filepath = reader.readLine();
                        writeArrayToFile(filepath);
                    	break;
                    
                    case 4:
                    	// Displaying the contents of the array
                        numberFile.displayArray();
                    	break;
                    	
                    case 5:
                        // Summing each number from the array
                        int sum = numberFile.calcSum();
                        System.out.println("Sum of the elements in the array: " + sum);
                        break;

                    case 6:
                        // Finding average of the array contents
                        double average = numberFile.calcAverage();
                        System.out.println("Average of the elements in the array: " + average);
                        break;
                    
                    case 7:
                    	System.out.println("Enter the num: ");
                    	int num = Integer.parseInt(reader.readLine());
                    	findNumberinArray(num);
                    	break;
                        
                    case 8:
                        // Displaying the contents of the array
                        arrayAcendingOrder();
                        break;

                    case 9:
                        // exiting
                        System.out.println("Exiting");
                        isRunning = false;
                        break;

                    default:
                        // choice out of range
                        throw new Exception("Choice out of range");
                }

            } catch(Exception e) {
                // printing error message
                System.out.println(e.getMessage());
            }
        }
    }
}