import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class AnnualSales {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		File file = new File("SalesNumbers.txt");
		try {
			File file1 = new File("SalesSummary2021.txt");
			FileWriter fw = new FileWriter(file1, true);
	    	BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			System.out.println("Sales ID\tAnnual Sales\tAverage Quaterly Sales");
			pw.println("Sales ID\tAnnual Sales\tAverage Quaterly Sales");
			sc = new Scanner(file);
			while(sc.hasNextLine()){
				int space = 0;
				String sale_id = null;
				double total = 0;
	            double avgQSales = 0;
				String line = sc.nextLine();
	            String var = "";
	            for(int i=0; i<line.length(); i++) {
	            	if(line.charAt(i) == ' ') {
	            		space++;
	            	}
	            	else
	            		var += line.charAt(i);          		
	            	if(space == 1) {
	            		sale_id = var;
	            		var = "";
	            		space++;
	            	}
	            	if(space == 3) {
	            		total += Double.parseDouble(var);
	            		var = "";
	            		space++;
	            	}
	            	if(space == 5) {
	            		total += Double.parseDouble(var);
	            		var = "";
	            		space++;
	            	}
	            	if(space == 7) {
	            		total += Double.parseDouble(var);
	            		var = "";
	            		space++;
	            	}
	            }
	            total += Double.parseDouble(var);
	            avgQSales = total/4;
	            System.out.println(sale_id+ "\t\t" +total+ "\t\t" +avgQSales);
	            pw.println(sale_id+ "\t" +total+ "\t\t" +avgQSales);
	        }
			pw.close();
    	}
    	catch (IOException e) {
    	    e.printStackTrace();
    	}
	}

}
