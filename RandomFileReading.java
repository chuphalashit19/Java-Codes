import java.io.*;
import java.util.*;

public class RandomFileReading {

  public static void main(String[] args) throws FileNotFoundException {
     Map<String,Integer> map = new HashMap<String,Integer>();
     for(int i = 0; i < 10; ++i)
     {
        String s = choose(new File("First Names.txt"));
        System.out.println(s);
     }
  }

  public static String choose(File f) throws FileNotFoundException
  {
     String result = null;
     Random rand = new Random();
     int n = 0;
     for(Scanner sc = new Scanner(f); sc.hasNext(); )
     {
        ++n;
        String line = sc.nextLine();
        if(rand.nextInt(n) == 0)
           result = line;         
     }

     return result;      
  }
}