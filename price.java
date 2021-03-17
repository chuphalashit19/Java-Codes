import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class price{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>( );
    	File file = new File("prices.txt");
    	BufferedReader reader = null;

    	try {
    	    reader = new BufferedReader(new FileReader(file));
    	    String text = null;

    	    while ((text = reader.readLine()) != null) {
    	    	String[] strarray = text.split(" ");
    	        for (int i = 0; i < strarray.length; i++) {
    	            String num = strarray[i];
    	            list.add(Integer.parseInt(num));
    	         }
    	    }
    	    File fout = new File("formattedresults.txt");
    		FileOutputStream fos = new FileOutputStream(fout);
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
    		bw.write("Original Price (in $)\tDiscounted\tEquivalent price (in LL)\n");
    	    for(int i = 0; i<list.size(); i++) {
    	    	DecimalFormat df = new DecimalFormat();
    	    	df.setMaximumFractionDigits(2);
    	    	float num = list.get(i);
    	    	float discount = (float) (num - (num*(0.333333)));
    	    	int LL = (int) (discount*1508);
    	    	bw.write("  $" +df.format(num)+ "\t\t  $" +df.format(discount)+ "\t\t  LL" +LL);
    	    	bw.newLine();
    	    }
    	    bw.close();
    	}
    	catch (FileNotFoundException e) {
    	    e.printStackTrace();
    	}
    	catch (IOException e) {
    	    e.printStackTrace();
    	}
    }

}