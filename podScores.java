package podScores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class podScores {
	
	public static int podScores(String filename) throws FileNotFoundException {
		int num, i, j = 0, num_stud = 0;
		float avg;
		char c;
		String line;
		FileInputStream file = new FileInputStream(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext())
	    {
			int max = 0, min = 99999;
			float sum = 0, count = 0, range;
	        line = sc.nextLine();
	        for (i = 0; i < line.length(); i++){
	            c = line.charAt(i);
	            if (Character.isDigit(c)) {
	            	num = Integer.parseInt(String.valueOf(c));
	            	sum += num;
	            	count += 1;
	            	max = Math.max(max, num);
	            	min = Math.min(min, num);
	            	num_stud += 1;
	            }
	        }
	        range = (max-min)+1;
	        avg = sum/count;
	        j += 1;
	        System.out.printf("Pod %d average score %.2f. range: %.0f", j, avg, range);
	        System.out.println();
        }
		return num_stud;
	}

	public static void main(String[] args) throws FileNotFoundException 
	{
		String filename = "podScores.txt";
		System.out.println(podScores(filename));
	}
}
